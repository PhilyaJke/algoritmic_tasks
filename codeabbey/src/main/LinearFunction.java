package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearFunction {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");
        List<Integer>vals = new ArrayList();

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        int x1,x2,y1,y2 = 0;
        int a, b = 0;

        for(int i = 0; i < vals.size(); i+=4) {
            x1 = vals.get(i); x2 = vals.get(i+2);
            y1 = vals.get(i+1); y2 = vals.get(i+3);
            a = (y2 - y1) / (x2 - x1);
            b = (y1 - x1 * a);
            System.out.print("(" + a + " " + b + ')' + " ");
        }
    }
}
