package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayChecksum {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");
        List<Integer> vals = new ArrayList<>();

        try(Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        long chlen = 0;
        long result = 0;
        for(int j = 0; j < vals.size(); j++){
            result = (result + vals.get(j)) * 113;
            if(result > 10000007){
                result = result % 10000007;
                System.out.println(result);
            }
        }
    }
}
