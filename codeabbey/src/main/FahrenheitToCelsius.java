package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FahrenheitToCelsius {
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

        double d;
        for(int i = 0; i < vals.size(); i++){
            d = 0;
            d = Math.round((vals.get(i) - 32) * 0.5555);
            System.out.print((int)d + " ");


        }
    }
}
