package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModuloAndTimeDifference {
    public static void main(String[] args) {

        List<Integer> vals = new ArrayList<>();

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                vals.clear();
                for(int j = 0; j < 8; j++){
                    int i = scanner.nextInt();
                    vals.add(i);
                }
                int Firstnum = (vals.get(0) * 24 * 60 * 60) + (vals.get(1) * 60 * 60) + (vals.get(2) * 60) + vals.get(3);
                int Secondnum = (vals.get(4) * 24 * 60 * 60) + (vals.get(5) * 60 * 60) + (vals.get(6) * 60) + vals.get(7);

                int result = Secondnum - Firstnum;
                String str = (result % 60 + " " + (result / 60) % 60 + " " + (result / 60 / 60) % 24 + " " + result / 60 / 60 / 24);
                System.out.println("(" + str + ")");
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }
    }
}
