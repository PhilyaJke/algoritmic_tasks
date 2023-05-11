package main;

public class BubbleSort {
    public static void main(String[] args) {

        int [] vals = {12, 10, 5 ,13, 16, 14, 4 ,6 ,3 ,2 ,15, 11, 7 ,8 ,17, 1, 9};

        int j = 0;
        int l = 0;
        boolean StopFlag = false;
        int num;
        while(!StopFlag) {
            StopFlag = true;
            l++;
            for (int i = 0; i < vals.length-1; i++) {
                if(vals[i] > vals[i+1]){
                    StopFlag = false;
                    num = vals[i];
                    vals[i] = vals[i+1];
                    vals[i+1] = num;
                    j++;
                }
            }
        }

        for(int i = 0; i < vals.length; i++){
            System.out.println(vals[i]);
        }

        System.out.println(l + " " + j);
    }
}
