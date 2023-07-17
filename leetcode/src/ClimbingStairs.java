public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n){
        if (n <= 2) return n;

        int x = 1;
        int y = 2;

        for(int i = 2; i < n; i ++) {
            int temp = x;
            x = y;
            y = temp + y;
        }
        return y;
    }
}

