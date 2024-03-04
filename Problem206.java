
public class Problem206 {

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode reverseList(ListNode head) {

        if (head == null) return null;
        else if (head.next == null) return head;

        ListNode prevNode = null;
        ListNode nextNode = null;

        while (head.next != null) {

            nextNode = head.next;
            head.next = prevNode;

            prevNode = head;
            head = nextNode;
        }

        head.next = prevNode;

        return head;
    }
}
