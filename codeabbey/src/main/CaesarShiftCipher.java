package main;

import java.io.*;
import java.util.Scanner;

public class CaesarShiftCipher {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        char[] arr = new char[26];
        int counter = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            arr[counter]=i;
            counter++;
        }

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){

                String str = scanner.nextLine();
                char[] task = str.toCharArray();

                for (char c : task) {
                    int num;
                    for (int j = 0; j < arr.length; j++) {
                        if (c == arr[j]) {
                            num = j;
                            char newChar;
                            if (num - 11 >= 0) {
                                newChar = arr[num - 11];
                            } else {
                                newChar = arr[26 - Math.abs(num - 11)];
                            }
                            System.out.print(newChar);
                        } else if (c == ' ') {
                            System.out.print(" ");
                            break;
                        } else if (c == '.') {
                            System.out.print("." + " ");
                            break;
                        }
                    }

                }


            }
        }catch (IOException exc){
            exc.printStackTrace();
        }

    }
}
