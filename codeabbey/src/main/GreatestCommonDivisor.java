package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        List<Integer> vals = new ArrayList<>();

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        for(int i = 0; i < vals.size(); i+=2) {
            BigInteger b1 = BigInteger.valueOf(vals.get(i));
            BigInteger b2 = BigInteger.valueOf(vals.get(i+1));
            BigInteger bsg = b1.gcd(b2);
            int chlen = (vals.get(i) * vals.get(i+1)) / bsg.intValue();
            System.out.print("(" + bsg.intValue() + " " + chlen + ")" + " ");
        }
    }
}
