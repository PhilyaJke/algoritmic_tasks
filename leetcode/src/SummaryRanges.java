import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {
        if(nums==null){
            return null;
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (i+1 < nums.length && nums[i]+1==nums[i+1]){
                i++;
            }
            int num2 = nums[i];
            if(num==num2){
                list.add(String.valueOf(num));
            }else{
                list.add(num+"->"+num2);
            }
            System.out.println(list);
        }
        return list;
    }
}
