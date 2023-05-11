package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/dasf.txt");
        List<Integer>list = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))){

            while(scanner.hasNextLine()){
                list.clear();
                for(int i = 0; i < 3; i++) {
                    int j = scanner.nextInt();
                    list.add(j);
                }

                double gypotinyza = Math.pow(list.get(0),2) + Math.pow(list.get(1),2);
                double katet = Math.pow(list.get(2),2);

                if(gypotinyza == katet){
                    System.out.print("R" + " ");
                }else if(gypotinyza > katet){
                    System.out.print("A" + " ");
                }else{
                    System.out.print("O" + " ");
                }
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }

    }
}
