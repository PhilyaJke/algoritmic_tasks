package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        String[]nums = scanner1.nextLine().split(" ");
        String[] vals = new String[9];

        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while (scanner.hasNextLine()){
                String str = scanner.nextLine();
                vals = str.split(" ");
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }


        int counter = 0;
        for(int i = 0; i < vals.length; i++){
            boolean flag = false;
            for(int j = 0; j < nums.length; j++){
                if(nums[j].contains(vals[i])){
                    char[]cha = nums[j].toCharArray();
                    StringBuilder updStr = new StringBuilder();
                    for(int l = 0; l < cha.length; l++){
                        if(String.valueOf(cha[l]).equals(vals[i])){
                            if(i % 2 == 0) {
                                cha[l] = '*';
                            }else{
                                cha[l] = 'o';
                            }
                        }
                        updStr.append(cha[l]);
                    }
                    nums[j] = updStr.toString();
                }
            }
            counter++;
            for (String num : nums) {
                char[] cha = num.toCharArray();
                int count1 = 0;
                int count2 = 0;
                for (char c : cha) {
                    if (c == '*') {
                        count1++;
                    } else if (c == 'o') {
                        count2++;
                    }
                }
                if (count1 == 3) {
                    flag = true;
                    break;
                } else if (count2 == 3) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(counter);
                break;
            }
            if(i == vals.length - 1){
                System.out.println(0);
            }
        }
    }
}
