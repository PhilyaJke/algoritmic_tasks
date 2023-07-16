public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = -1;

        int low = 0;
        int hight = nums.length-1;

        while (low<=hight){
            int middle = low+(hight-low)/2;
            if(nums[middle]<target){
                low=middle+1;
                index=low+(hight-low)/2;;
            }else if(nums[middle]>target){
                hight=middle-1;
                index=low+(hight-low)/2;;
            }else if(nums[middle]==target){
                index=middle;
                break;
            }
        }

        return index;
    }

}
