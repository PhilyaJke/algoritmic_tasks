package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/1.txt");
        ArrayList<Integer> list = new ArrayList<>();
        try(Scanner scanner = new Scanner(new FileInputStream(file))){
            while(scanner.hasNextLine()){
                list.add(scanner.nextInt());
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

        List<Integer> answer = list;

        while(answer.size() != 1) {
            int max = 0;
            int num = 0;
            for (int i = 0; i < answer.size(); i++) {
                if (answer.get(i) > max) {
                    max = answer.get(i);
                    num = i;
                }
            }
            System.out.print(num + " ");
            answer = count(answer, num);
        }

    }
    public static List<Integer> count(List<Integer> list, int max){
        int i = list.get(list.size() - 1);
        list.set(max,i);
        list.remove(list.size() - 1);

        return list;
    }
}
