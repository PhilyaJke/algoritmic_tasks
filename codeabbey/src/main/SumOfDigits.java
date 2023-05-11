package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");
        List<Integer> vals = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()) {
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        int[] numArr1 = new int[45];

        for(int i = 0; i < vals.size(); i++){
            numArr1[i] = vals.get(i);
        }

        vals.clear();

        for(int i = 0 ; i < numArr1.length; i+=3){
            vals.add(numArr1[i] * numArr1[i+1] + numArr1[i+2]);
        }

        int j = 0;
        int value;

        for(int p = 0; p < vals.size(); p++) {
            value = 0;
            String str = String.valueOf(vals.get(p));
            int num = vals.get(p);

            for (int i = 0; i < str.length(); i++) {
                j = num % 10;
                value = value + j;
                num = num / 10;
            }
            System.out.print(value + " ");
        }

    }
}
