import org.junit.Test;

public class TestLianBiao {

    LianBiao code = new LianBiao();

    @Test
    public void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = code.removeNthFromEnd(head, 2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    @Test
    public void testCreateListInsertHead() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ListNode head = code.createListInsertHead(arr);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    @Test
    public void testCreateListInsertTail() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ListNode head = code.createListInsertTail(arr);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
