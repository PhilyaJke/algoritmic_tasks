package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TriangleArea {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/dasf.txt");
        List<Integer> vals = new ArrayList<>();

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                vals.clear();
                for(int i = 0; i < 6; i++) {
                    vals.add(scanner.nextInt());
                }
                double a = Math.sqrt(Math.pow((vals.get(2) - vals.get(0)), 2) + Math.pow((vals.get(3) - vals.get(1)), 2));
                double b = Math.sqrt(Math.pow((vals.get(4) - vals.get(2)), 2) + Math.pow((vals.get(5) - vals.get(3)), 2));
                double c = Math.sqrt(Math.pow((vals.get(4) - vals.get(0)), 2) + Math.pow((vals.get(5) - vals.get(1)), 2));

                double result = (a + b + c) / 2;
                double totalResult = Math.sqrt(result * (result - a) * (result - b) * (result - c));
                System.out.print(totalResult + " ");
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }

    }
}
