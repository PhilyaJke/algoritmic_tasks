import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public ArrayList intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>list = new ArrayList();
        for (int i = 0; i < nums1.length; i++){
            if(list.contains(nums1[i])){
                continue;
            }
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = (int) list.get(i);
        }
        return list;
    }
}
