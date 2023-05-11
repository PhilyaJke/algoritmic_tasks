package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[]args){
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        String[]WinnersMoves = {"RS","SP","PR","SR","PS","RP",};

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                String[] vals = str.split(" ");

                int answer = 0;
                for (String val : vals) {
                    if (val.equals(WinnersMoves[0]) || val.equals(WinnersMoves[1]) || val.equals(WinnersMoves[2])) {
                        answer = 1;
                    } else if (val.equals(WinnersMoves[3]) || val.equals(WinnersMoves[4]) || val.equals(WinnersMoves[5])) {
                        answer = 2;
                    }
                }
                System.out.print(answer + " ");
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
}
