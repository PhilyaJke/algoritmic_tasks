package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class MatchingWords {
    public static void main(String[] args) {

        File file = new File("/Users/philyaborozdin/Desktop/Document.txt");

        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] ch = str.split(" ");
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < ch.length; i++) {
                    for (int j = i + 1; j < ch.length; j++) {
                        if (ch[i].equals(ch[j])) {
                            list.add(ch[i]);
                            break;
                        }
                    }
                }
                Collections.sort(list);
                HashSet<String> set = new HashSet<>(list);
                Iterator<String> iterator = set.iterator();
                List<String> lst = new ArrayList<>();
                while (iterator.hasNext()) {
                    String sr = iterator.next();
                    lst.add(sr);
                }
                Collections.sort(lst);
                for (String s : lst) {
                    System.out.print(s + " ");
                }
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
