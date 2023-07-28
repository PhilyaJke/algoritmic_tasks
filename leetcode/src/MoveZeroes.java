import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i]==0){
                for (int k = i; k < nums.length-j-1; k++) {
                    int temp = nums[k];
                    nums[k] = nums[k+1];
                    nums[k+1] = temp;
                }
                j++;
            }
        }
    }
}
