import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args){
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n){
        List<Integer>list = new ArrayList<>();
        while (true){
            int sum = 0;
            for (;n>0; n/=10) {
                sum+=Math.pow(n%10,2);
            }
            if(!list.contains(sum)) {
                list.add(sum);
            }else{
                return false;
            }
            if(sum==1)
                return true;
            n = sum;
        }
    }
}
