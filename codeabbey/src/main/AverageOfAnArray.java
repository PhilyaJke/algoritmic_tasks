package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAnArray {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");


        List<Integer>vals = new ArrayList<Integer>();


        try (Scanner scanner = new Scanner(new FileInputStream(file))) {

            String[] string;
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                string = str.split(" ");

                for(int i = 0; i < string.length; i++){
                    vals.add(Integer.parseInt(String.valueOf(string[i])));
                }

                double totalResult = 0;
                for(int i = 0; i < vals.size(); i++){
                    totalResult += vals.get(i);
                }
                int d = vals.size() - 1;
                double dp = totalResult / d;
                System.out.print(Math.round(dp) + " ");
                vals.clear();
                string = null;
            }



        }catch(IOException exc){
            exc.printStackTrace();
        }

    }
}
