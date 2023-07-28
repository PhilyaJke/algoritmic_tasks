public class PowerOfThree {
    public static void main(String[] args) {

    }
    public boolean isPowerOfThree(int n) {
        double num = n;
        while (num>1){
            num = num/3;
        }
        return num==1;
    }
}
