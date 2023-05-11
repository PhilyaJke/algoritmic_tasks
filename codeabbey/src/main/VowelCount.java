package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Folder/dasf.txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()) {

                char[] vals = scanner.nextLine().toCharArray();
                char[] vowel = {'a', 'e', 'i', 'o', 'u', 'y'};
                int count = 0;

                for(int i = 0; i < vals.length; i++){
                    for(int j = 0; j < vowel.length; j++){
                        if(vals[i] == vowel[j]){
                            count++;
                        }
                    }
                }
                System.out.print(count + " ");
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

    }
}
