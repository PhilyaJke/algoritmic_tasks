package main;

import java.io.*;
import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                double value = Math.floor(Double.parseDouble(str) * 6) + 1;
                System.out.print((int)value + " ");

            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
