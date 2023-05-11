package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BlackjackCounting {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        Set<String>setOfNumSymbols = new HashSet(Set.of("2","3","4","5","6","7","8","9"));
        Set<String>setOfBigSymbols = new HashSet(Set.of("10","T", "J", "Q", "K"));
        String[] inputValues;
        String Ace = "A";

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                String str = scanner.nextLine();
                inputValues = str.split(" ");

                int valResult = 0;
                for(int i = 0; i < inputValues.length; i++){
                    if(setOfNumSymbols.contains(inputValues[i])){
                        valResult += Integer.parseInt(inputValues[i]);
                    }else if(setOfBigSymbols.contains(inputValues[i])){
                        valResult += 10;
                    }else if(inputValues[i].equals(Ace)){
                        if(valResult <= 10){
                            valResult+=11;
                        }else{
                            valResult++;
                        }
                    }
                }
                if(valResult > 21) {
                    System.out.print("Bust" + " ");
                }else{
                    System.out.print(valResult + " ");
                }
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
