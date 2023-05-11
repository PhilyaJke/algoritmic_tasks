package main.SumsInLoop;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SumsInLoop {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try(DataInputStream inputStream = new DataInputStream(new FileInputStream(file))){
            while(inputStream.read()!=-1){
                int sum = 0;
                String str = inputStream.readLine();
                String[] arr = str.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    sum+=Integer.parseInt(arr[i]);
                }
                System.out.print(sum + " ");
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
