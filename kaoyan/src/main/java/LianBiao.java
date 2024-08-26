public class LianBiao {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        if (length == n) return head.next;
        int index = length - n;
        cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

    /*
    头插法建立链表
     */
    public ListNode createListInsertHead(int[] nums) {
        ListNode head = new ListNode();
        for (int num : nums) {
            ListNode node = new ListNode(num);
            node.next = head.next;
            head.next = node;
        }
        return head.next;
    }

    /*
    尾插法建立链表
     */
    public ListNode createListInsertTail(int[] nums) {
        ListNode head = new ListNode();
        ListNode cur = head;
        for (int num : nums) {
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return head.next;
    }
}
