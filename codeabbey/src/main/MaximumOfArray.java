package main;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            while(scanner.hasNextLine()) {
                int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int min = 999999999;
                int max = 0;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]>max){
                        max = arr[i];
                    }else if(arr[i]<min){
                        min = arr[i];
                    }
                }
                System.out.println(max + " " + min);
            }

        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
