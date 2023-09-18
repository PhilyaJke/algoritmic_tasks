import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumRightShiftsToSortTheArray {
    public static void main(String[] args) {
        System.out.println(generate(new ArrayList<Integer>(List.of(3,4,5,1,2))));
    }
    public static int generate(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        int[] sortedNums = arr.clone();
        quickSort(sortedNums, 0, sortedNums.length-1);
        if(check(arr, sortedNums)){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            sort(arr);
            if(check(arr, sortedNums)){
                return i+1;
            }
        }
        return -1;
    }

    public static void sort(int[] arr){
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }

    public static boolean check(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
