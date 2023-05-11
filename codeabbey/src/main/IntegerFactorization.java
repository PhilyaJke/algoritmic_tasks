package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class IntegerFactorization {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/IdeaProjects/codeabbeyTasks/txt");

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                BigInteger inputNum = new BigInteger(scanner.nextLine());

                while(!inputNum.equals(1)) {
                    boolean flag = false;
                    for (int i = 2; i < 1000; i++) {
                        BigInteger num = new BigInteger(String.valueOf(i));
                        if(inputNum.mod(num) == BigInteger.ZERO){
                            inputNum = inputNum.divide(num);
                            System.out.print(i + "*");
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.print(inputNum + " ");
                        break;
                    }
                }
                System.out.print(" ");
            }
        }catch (FileNotFoundException exc){
            throw new RuntimeException(exc);
        }
    }
}
