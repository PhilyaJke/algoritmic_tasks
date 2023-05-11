package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NeumannsRandomGenerator {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> vals = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        for(int value: vals){
            System.out.print(count(value) + " ");
        }
    }

    public static int count(int num){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while(true){
            list.add(num);
            num = num * num;
            num = (num / 100) % 10000;
            count++;

            for(int x: list){
                if(num == x){
                    return count;
                }
            }
        }
    }
}
