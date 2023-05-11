package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsShuffling {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        List<String> cards = new ArrayList<>();
        List<Integer> Indexes = new ArrayList<>();
        char[] ranks = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
        char[] suits = {'C','D','H','S'};

        for(int i = 0; i < suits.length; i++){
            for(int j = 0 ; j < ranks.length; j++){
                cards.add(suits[i] + "" + ranks[j]);
            }
        }

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                int inputNum = scanner.nextInt();
                if(inputNum > 51){
                    Indexes.add(inputNum % 52);
                }else{
                    Indexes.add(inputNum);
                }
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }

        for(int i =  0; i < cards.size(); i++){
            String num1 = cards.get(i);
            String num2 = cards.get(Indexes.get(i));
            cards.set(Indexes.get(i),num1);
            cards.set(i,num2);
        }

        for(String value: cards){
            System.out.print(value + " ");
        }

    }
}
