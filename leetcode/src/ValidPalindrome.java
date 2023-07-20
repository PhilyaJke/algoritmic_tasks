public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "").replace(" ","").toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return stringBuilder.reverse().toString().equals(str);
    }
}
