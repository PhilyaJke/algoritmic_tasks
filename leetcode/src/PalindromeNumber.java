class PalindromeNumber{
    public static boolean isPalindrome(int x){
        int input = x;
        int num = 0;
        if(input < 0){
            return false;
        }else {
            while (input != 0) {
                num *= 10;
                num += input % 10;
                input /= 10;
            }
            return x == num;
        }
    }
}