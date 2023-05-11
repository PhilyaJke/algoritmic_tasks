package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ModularCalculator {
    public static void main(String[]args) {

        List<String> list = new ArrayList<>();
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/homeworkCODEABAY.txt");

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        StringBuilder str = new StringBuilder();
        for(String values: list){
            str.append(values);
        }

        long totalresult = 5;
        int delitel = 6415;

        for (String auxiliarySTR : list) {
            final int totalresult1 = Integer.parseInt(auxiliarySTR.substring(1).replace(" ", ""));
            switch (auxiliarySTR.charAt(0)) {
                case '*' -> {
                    totalresult *= totalresult1;
                    totalresult %= delitel;
                }
                case '+' -> {
                    totalresult += totalresult1;
                    totalresult %= delitel;
                }
                case '-' -> {
                    totalresult -= totalresult1;
                    totalresult %= delitel;
                }
                case '%' -> totalresult %= totalresult1;
            }
        }
        System.out.println(totalresult);
    }
}
