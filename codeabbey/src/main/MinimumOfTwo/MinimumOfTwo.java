package main.MinimumOfTwo;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumOfTwo {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
                if (arr[0] > arr[1]) {
                    System.out.print(arr[1] + " ");
                } else {
                    System.out.print(arr[0] + " ");
                }
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
