package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {

        List<Integer> vals = new ArrayList<>();

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }


        for(int i = 0; i < vals.size(); i++){
            int count = 0;
            int num = vals.get(i);
            while(num != 1){
                if(num % 2 == 0){
                    num = num / 2;
                    count++;
                }else{
                    num = num * 3 + 1;
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
