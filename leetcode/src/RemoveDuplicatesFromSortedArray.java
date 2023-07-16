import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums) + " " + Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

}
