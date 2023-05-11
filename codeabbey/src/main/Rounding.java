package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");
        List<Double> vals = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            int n = 0;

            while(n < 56) {

                double num = scanner.nextDouble();
                vals.add(num);
                n++;
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        double num1;
        double num2;
        for(int i = 0; i < vals.size(); i+=2){
            num1 = 0; num2 = 0;

            num1 = vals.get(i) / vals.get(i+1);

            System.out.print(Math.round(num1) + " ");
        }

    }
}
