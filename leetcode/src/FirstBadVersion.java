public class FirstBadVersion{
    public static void main(String [] args) {
    }

    public int firstBadVersion(int n) {
        int index = -1;
        while (n!=0){
            if(isBadVersion(n)==false){
                index = n;
                break;
            }
            n--;
        }
        return index;
    }
}
