public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        var s = deleteDuplicates(
                new ListNode(1, new ListNode(2, new ListNode(3))));
        while (s.next != null){
            System.out.println(s.val);
            s = s.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (head == null)
        {
            return head;
        }

        while (temp.next !=null)
        {
            if (temp.val != temp.next.val) {
                temp = temp.next;
            }
            else temp.next = temp.next.next;
        }
        return head;
    }
}
