import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {
        List<Integer>list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = list.size()-1;
        boolean flag = true;
        while (i<=j){
            if(list.get(i) == list.get(j)){
                flag = true;
            }else {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
