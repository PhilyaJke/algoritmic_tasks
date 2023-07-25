public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        ListNode listNode1 = null;
        ListNode listNode2 = head;
        if (head == null) {
            return null;
        }
        while (listNode2 != null) {
            ListNode temp = listNode2.next;
            listNode2.next = listNode1;
            listNode1 = listNode2;
            listNode2 = temp;
        }
        return listNode1;
    }
}
