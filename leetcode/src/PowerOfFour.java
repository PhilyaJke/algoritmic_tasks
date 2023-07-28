public class PowerOfFour {
    public static void main(String[] args) {

    }
    public boolean isPowerOfFour(int n) {
        double num = n;
        while (num > 1) {
            num = num / 4;
        }
        return num == 1;
    }
}
