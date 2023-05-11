package main;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");

        try(var scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                BigInteger firstNum = new BigInteger("0");
                BigInteger SecondNum = new BigInteger("1");
                BigInteger resultValue;
                String str  = scanner.nextLine();
                BigInteger InputNum = new BigInteger(str);
                int counter = 0;

                while(true){
                    if(InputNum.equals(BigInteger.valueOf(0))){
                        System.out.print(0 + " ");
                        break;
                    }
                    resultValue = firstNum.add(SecondNum);
                    SecondNum = firstNum;
                    firstNum = resultValue;
                    counter++;
                    if(resultValue.equals(InputNum)){
                        System.out.print(counter + " ");
                        break;
                    }
                }
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
}
