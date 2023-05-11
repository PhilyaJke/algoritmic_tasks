package main;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            while(scanner.hasNextLine()) {
                double[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
                double weight = arr[0];
                double grown = arr[1];
                double BMI = weight / Math.pow(grown,2);

                if(BMI<18.5){
                    System.out.print("under" + " ");
                }else if(BMI>=18.5 && BMI<25){
                    System.out.print("normal" + " ");
                }else if(BMI>=25 && BMI<30){
                    System.out.print("over" + " ");
                }else if(BMI>=30){
                    System.out.print("obese" + " ");
                }

            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
