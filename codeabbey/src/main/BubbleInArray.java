package main;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BubbleInArray {

    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/txtForJavaTests/k8.txt");
        List<Integer>list = new ArrayList<>();

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                int num = scanner.nextInt();
                list.add(num);
            }
        }catch(IOException exc){
            exc.printStackTrace();
            System.err.println("Pizda oshibka v chtenii file");
        }

        Object[] vals = list.toArray();

        int count = 0;

        for (int i = 1; i < vals.length - 1; i++) {
            if ((int) vals[i] > (int) vals[i + 1]) {
                count++;
                int num = (int) vals[i];
                vals[i] = vals[i + 1];
                vals[i + 1] = num;
            }
        }

        int result = 0;
        for(int i = 0 ; i < vals.length; i++){
            result =  (result + (int) vals[i]) * 113;
            if(result >= 10000007) {
                result = result % 10000007;
            }
        }

        System.out.println(count + " " + result);

    }
}
