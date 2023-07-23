public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(3);
        removeElements(listNode, 3);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val==val ? head.next : head;
    }
}
