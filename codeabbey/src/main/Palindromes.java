package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/homeworkCODEABAY.txt");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                list.add(str);
            }
        }catch (FileNotFoundException exc){
            exc.printStackTrace();
        }

        for(String value: list){
            if (isPalindrom(value) == true) {
                System.out.print("Y" + " ");
            }else{
                System.out.print("N" + " ");
            }
        }
    }
    public static boolean isPalindrom(String str){
        return str.replace(" ","").replace(",","").
                replace(".","").replace("-", "").
                equalsIgnoreCase(new StringBuilder(str.replace(" ","").
                        replace(",","").replace(".","").
                        replace("-","")).reverse().toString());
    }
}
