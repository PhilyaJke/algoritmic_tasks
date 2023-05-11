package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class BicycleRace {
    public static void main(String[] args) {
        var file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] InputData = str.split(" ");

                double S = (Double.parseDouble(InputData[0]) / (Double.parseDouble(InputData[1])
                        + Double.parseDouble(InputData[2]))) * Double.parseDouble(InputData[1]);
                System.out.print(S + " ");
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
