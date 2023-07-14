import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equation {
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
        double x = ((Math.pow(c,2)-b)/a);
        if(c<0)
            System.out.println("NO SOLUTION");
        else if ((a + b) == c*c && (2 * a + b) == c*c)
            System.out.println("MANY SOLUTIONS");
        else{
            if(a!=0 && x%1==0)
                System.out.println((int) x);
            else
                System.out.println("NO SOLUTION");
        }
    }
}
