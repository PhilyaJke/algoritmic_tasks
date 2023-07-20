import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        int x = nums.length/2;
        HashMap hashMap = new HashMap();
        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else {
                hashMap.replace(num, (int) hashMap.get(num)+1);
            }
        }
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if((int) hashMap.get(nums[i])>x){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
