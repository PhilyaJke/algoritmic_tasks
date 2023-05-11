package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SharePriceVolatility {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/IdeaProjects/codeabbeyTasks/txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                String[] vals = str.split(" ");
                double meanNum = 0;
                double valsSize = vals.length - 1;

                for (int i = 1; i < vals.length; i++) {
                    meanNum += Double.parseDouble(vals[i]);
                }
                meanNum = meanNum / valsSize;

                double num = 0;
                for (int i = 1; i < vals.length; i++) {
                    double differenceOfNums = meanNum - Double.parseDouble(vals[i]);
                    differenceOfNums = Math.pow(differenceOfNums,2);
                    num += Math.abs(differenceOfNums);
                }
                double d = num / valsSize - 1;
                if (Math.sqrt(d) / 4 > (meanNum/100)){
                    System.out.print(vals[0] + " ");
                }
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }
    }
}
