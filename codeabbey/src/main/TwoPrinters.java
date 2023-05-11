package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TwoPrinters {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/tttxxxttt.txt");
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String[] strs = scanner.nextLine().split(" ");
                int nx = Integer.parseInt(strs[2]) * Integer.parseInt(strs[1]) / (Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]));
                System.out.print(Math.min((Integer.parseInt(strs[2]) - nx) * Integer.parseInt(strs[1]), (nx + 1) * Integer.parseInt(strs[0])) + " ");
            }

        } catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
