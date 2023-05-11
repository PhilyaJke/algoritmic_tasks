package main;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chr = str.toCharArray();

        for(int i = chr.length - 1; i >= 0; i--){
            System.out.print(chr[i]);
        }


    }
}
