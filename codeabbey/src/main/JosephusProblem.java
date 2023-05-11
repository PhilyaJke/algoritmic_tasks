package main;

import java.util.*;
import java.util.stream.Collectors;

public class JosephusProblem {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i = 1; i <= 39; i++){
            list.add(i);
        }
        List sublist = new ArrayList();
        int count = 0;
        while(list.size()!=1){
            list.removeAll(sublist);
            for (int i = 0; i < list.size(); i++){
                count++;
                if(count==7){
                    sublist.add(list.get(i));
                    count=0;
                }
            }
        }
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
