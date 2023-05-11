package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BitCount {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/tttxxxttt.txt");
        try(Scanner scanner = new Scanner(file)){
            String[] strs = scanner.nextLine().split(" ");
            for (String str : strs) {
                System.out.print(Integer.bitCount(Integer.parseInt(str)) + " ");
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
