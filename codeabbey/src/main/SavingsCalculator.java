package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SavingsCalculator {
    public static void main(String[]args) {

        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/dasf.txt");
        List<Integer>list = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))) {

            int count = 0;

            while (scanner.hasNextLine()) {
                list.add(scanner.nextInt());
            }

            for (int i = 0; i < list.size() - 2; i+=3) {
                double s = list.get(i);
                int r = list.get(i+1);
                int p = list.get(i+2);
                count = 0;

                while (s <= r) {
                    for(int j = 0; j <= 12; j++) {
                        if(s > r){
                            break;
                        }
                        s = s + ((s / 100) * p);
                        count++;
                    }
                    Math.ceil(s);
                }
                System.out.print(count + " ");
            }
        }catch (IOException exc) {
            exc.printStackTrace();
        }

    }
}
