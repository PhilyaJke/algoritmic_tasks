package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        List<Integer> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                list.clear();
                double result = 1;
                for(int i = 0; i < 2; i++){
                    list.add(scanner.nextInt());
                }
                for(int i = 0; i < list.get(1); i++){
                    result = ((list.get(0) / result) + result) / 2;
                }
                System.out.print(result + " ");
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
