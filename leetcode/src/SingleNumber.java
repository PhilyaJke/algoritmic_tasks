import java.util.HashMap;
import java.util.Map;


public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
    }

    public static int singleNumber(int[] nums) {
        HashMap hashMap = new HashMap();
        for (int num : nums) {
            int count = 1;
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, count);
            } else {
                hashMap.replace(num, count + 1);
            }
        }

        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if((int) hashMap.get(nums[i])==1){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
