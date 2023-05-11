package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MedianOfThree {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        int[] ArrayValues;

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {

            while (scanner.hasNextLine()) {
                ArrayValues = new int[3];
                for (int i = 0; i < 3; i++) {
                    int j = scanner.nextInt();
                    ArrayValues[i] = j;
                }

                Arrays.sort(ArrayValues);

                System.out.print(ArrayValues[1] + " ");


            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
