public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(10));
    }

    public static boolean isUgly(int num) {
        while(num!=0 && num>=0){
            if(num==1)
                return true;
            if(num%2==0)
                num = num/2;
            else if(num%3==0)
                num = num/3;
            else if(num%5==0)
                num = num/5;
            else
                return false;
        }
        return false;
    }
}
