public class FindTheIndexOfTheFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("вавава", " "));
    }
    public static int strStr(String haystack, String needle) {
        int num = -1;
        for (int i = 0; i < haystack.length(); i+=1) {
            if (haystack.startsWith(needle, i)) {
                num = i;
                break;
            }
        }
        return num;
    }
}
