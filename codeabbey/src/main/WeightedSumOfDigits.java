package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedSumOfDigits {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        List<Integer> vals = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {

                vals.clear();
                int n = 0;
                int num = 0;
                num = scanner.nextInt();

                while (num != 0) {
                    int j = num % 10;
                    vals.add(j);
                    num = num / 10;
                }

                int p = vals.size();
                int g = 0;
                for(int j = 0; j < vals.size(); j++){
                    g = g + vals.get(j) * p;
                    p--;
                }
                System.out.print(g + " ");
            }

        }catch(IOException exc){
            System.err.println("Тут блять проблема какая-то");
            exc.printStackTrace();
        }

    }
}
