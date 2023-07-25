public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums==null){
            return false;
        }
        boolean flag = false;
        int numsLength = nums.length;
        quickSort(nums, 0, numsLength-1);
        int num = nums[0];
        for (int i = 1; i < numsLength; i++) {
            if(nums[i]==num){
                flag = true;
                break;
            }else{
                num = nums[i];
                flag = false;
            }
        }
        return flag;
    }

    public static void quickSort(int[] arr, int begin, int end){
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex, end);
        }
    }

    public static int partition(int arr[], int begin, int end) {
        int rightIndex = end;
        int leftIndex = begin;

        int pivot = arr[begin + (end - begin) / 2];

        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
