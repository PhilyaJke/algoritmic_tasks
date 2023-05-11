package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args){
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        String[] str;

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                str = scanner.nextLine().split(" ");
                int num = Integer.parseInt(str[0]);
                String rotatedStr = str[1];

                if(num > 0){
                    String firstString = rotatedStr.substring(num) + rotatedStr.substring(0,num);
                    System.out.print(firstString + " ");
                }else{
                    final int endIndex = rotatedStr.length() - Math.abs(num);
                    String firstString = rotatedStr.substring(endIndex) + rotatedStr.substring(0, endIndex);
                    System.out.print(firstString + " ");
                }
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }

}
