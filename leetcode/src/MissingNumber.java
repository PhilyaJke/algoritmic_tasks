import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{45,35,38,13,12,23,48,15,44,21,43,26,6,37,1,19,22,3,11,32,4,16,28,49,29,36,33,8,9,39,46,17,41,7,2,5,27,20,40,34,30,25,47,0,31,42,24,10,14}));
    }

    public static int missingNumber(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        if(nums[0]!=0){
            return 0;
        }
        System.out.println(Arrays.toString(nums));
        boolean flag = true;
        int num = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1==nums[i+1]){
                flag = true;
            }else{
                num = nums[i]+1;
                flag = false;
                break;
            }
        }
        return flag==true ? nums[nums.length-1]+1 : num;
    }


    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int tmp  = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
