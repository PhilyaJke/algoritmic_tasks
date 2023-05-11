package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortWithIndexes {
    public static void main(String[] args) {

        File file = new File("D:\\Програминг\\Papka\\txt.txt");

        List<Integer>vals = new ArrayList<>();

        try(Scanner scanner  = new Scanner(file)){
            while(scanner.hasNextLine()){
                int i = scanner.nextInt();
                vals.add(i);
            }
        }catch(IOException exc){
            exc.printStackTrace();
        }

        int[] nums = new int[vals.size()];

        for(int i = 0; i < vals.size(); i++){
            nums[i] = vals.get(i);
        }

        int n = 0;

        while(n < nums.length){
            for(int i = 0; i < nums.length - 1; i++){
                if (nums[i + 1] < nums[i]){
                    int num = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = num;
                }
            }
            n++;
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < vals.size() ; j++){
                if(nums[i] == vals.get(j)){
                    System.out.print(j + 1 + " ");
                }
            }
        }


    }
}
