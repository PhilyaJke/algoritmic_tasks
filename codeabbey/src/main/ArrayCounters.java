package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayCounters {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        int[] counts = {0,0,0,0,0};
        List<Integer>InputNums = new ArrayList();

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                InputNums.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        for(int i = 0; i < InputNums.size(); i++){
            if(InputNums.get(i) == 1){
                counts[0]++;
            }else if(InputNums.get(i) == 2){
                counts[1]++;
            }else if(InputNums.get(i) == 3){
                counts[2]++;
            } else if(InputNums.get(i) == 4){
                counts[3]++;
            } else if(InputNums.get(i) == 5) {
                counts[4]++;
            }
        }

        for(int i = 0; i < counts.length; i++){
            System.out.print(counts[i] + " ");
        }


    }
}
