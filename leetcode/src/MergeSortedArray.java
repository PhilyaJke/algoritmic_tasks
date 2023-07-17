import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3, new int[]{8,2,5}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        quicksort(nums1, 0, nums1.length-1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void quicksort(int[] arr, int low, int hight){
        if(low<hight) {
            int index = partion(arr, low, hight);
            quicksort(arr, low, index - 1);
            quicksort(arr, index, hight);
        }
    }

    public static int partion(int[] arr, int low, int hight){

        int right = hight;
        int left = low;

        int middle = arr[low + (hight - low)/2];

        while (left<=right){
            while (arr[left] < middle){
                left++;
            }
            while (arr[right] > middle){
                right--;
            }
            if(left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}



