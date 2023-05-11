package main;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;

public class CardNames {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");

        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardValues = {};

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                cardValues = str.split(" ");
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

        for(int i = 0; i < cardValues.length; i++){
            int suitValue = Integer.parseInt(cardValues[i]) / 13;
            int rankValue = Integer.parseInt(cardValues[i]) % 13;
            System.out.print(ranks[rankValue] + "-of-" + suits[suitValue] + " ");
        }
    }
}
