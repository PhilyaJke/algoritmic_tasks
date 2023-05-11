package main.MinimumOfThree;

import java.io.*;
import java.util.Scanner;

public class MinimumOfThree {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            int p = 0;
            int[] vals = new int[72];
            while(p < 72) {
                vals[p] = scanner.nextInt();
                p++;
            }

            for(int i = 0; i < vals.length; i++){

                if(vals[i] > vals[i+1]){
                    if(vals[i+1] > vals[i+2]){
                        System.out.print(vals[i+2] + " ");
                    } else{
                        System.out.print(vals[i+1] + " ");
                    }
                } else {
                    if(vals[i] > vals[i+2]){
                        System.out.print(vals[i+2] + " ");
                    }else{
                        System.out.print(vals[i] + " ");
                    }
                }
                i+=2;
            }
        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        }

    }
}
