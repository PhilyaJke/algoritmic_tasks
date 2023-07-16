public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
    }

    public static int lengthOfLastWord(String s) {
        var k = s.split(" ");
        return k[k.length-1].length();
    }
}
