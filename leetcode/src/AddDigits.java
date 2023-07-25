public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(1000));
    }

    public static int addDigits(int num) {
        if(0<=num && num<=9){
            return num;
        }
        int sum = 0;
        for (; num > 0; num/=10) {
            sum+=num%10;
        }
        return addDigits(sum);
    }
}
