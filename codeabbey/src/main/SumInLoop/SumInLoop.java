package main.SumInLoop;

import java.util.Scanner;

public class SumInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result+=Integer.parseInt(arr[i]);
        }

        System.out.println(result);

    }
}
