package main;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            while(scanner.hasNextLine()) {
                int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int A = arr[0];
                int B = arr[1];
                int C = arr[2];
                int result = 0;
                for (int i = 0; i < C; i++) {
                    int num = A + B*i;
                    result += num;
                }
                System.out.print(result + " ");
            }

        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
