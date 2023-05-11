package main;

import java.io.FileNotFoundException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmoothingTheWeather {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/dasf.txt");
        List<Double> list = new ArrayList<>();
        String str = "";

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {

            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
            }
        } catch (
                FileNotFoundException exc) {
            exc.printStackTrace();
        }

        str.replace(".", ",");
        String[] vals = str.split(" ");

        for (String value : vals) {
            list.add(Double.parseDouble(value));
        }

        System.out.print(list.get(0) + " ");
        for (int i = 1; i < vals.length - 1; i++) {
            double num = (list.get(i - 1) + list.get(i) + list.get(i + 1)) / 3;
            System.out.print(num + " ");
        }
        System.out.println(list.get(list.size() - 1) + " ");
    }
}
