public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        double num = n;
        while (num>1){
            num = num/2;
        }
        return num==1;
    }
}
