import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }

    public static int[] plusOne(int[] digits) {
        if(digits.length==1){
            if(digits[0]==9){
                return new int[]{1,0};
            }else {
                digits[0] += 1;
                return digits;
            }
        }

        for(int i = digits.length-1; i>=0; i--){
            var num = digits[i]+1;
            if(num>=10){
                digits[i] = 0;
            }else {
                digits[i] = num;
                break;
            }
        }

        if(digits[0]==0){
            int[] newArray = new int[digits.length+1];
            System.arraycopy(digits, 0, newArray, 0, digits.length);
            newArray[0]=1;
            return newArray;
        }

        return digits;
    }
}
