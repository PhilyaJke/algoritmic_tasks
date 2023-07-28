import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
        int num = s.length-1;
        for (int i = 0; i < s.length; i++) {
            if(i<=num) {
                char temp = s[i];
                s[i] = s[num];
                s[num] = temp;
                num--;
            }
        }
    }
}
