package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FoolsDay2014 {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int sum = 0;
                int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i]; j++) {
                        sum+=arr[i];
                    }
                }
                System.out.print(sum + " ");
            }
        }catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
