package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleDiceRoll {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");
        List<Integer> vals = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                vals.add((i % 6) + 1);
            }
        } catch(FileNotFoundException exc){
            exc.printStackTrace();
        }

        for(int i = 0; i < vals.size(); i+=2){
            System.out.print(vals.get(i) + vals.get(i+1) + " ");
        }
    }
}
