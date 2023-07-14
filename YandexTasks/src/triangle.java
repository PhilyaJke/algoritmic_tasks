import java.util.*;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true){
            list.add(scanner.nextInt());
            if(list.size()==3){
                break;
            }
        }
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
