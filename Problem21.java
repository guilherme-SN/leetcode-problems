
public class Problem21 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyNode = new ListNode();
        ListNode tempNode = dummyNode;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {

                tempNode.next = list1;
                list1 = list1.next;
            } else {

                tempNode.next = list2;
                list2 = list2.next;
            }

            tempNode = tempNode.next;
        }

        if (list1 != null) {

            tempNode.next = list1;
        } else if (list2 != null) {

            tempNode.next = list2;
        }

        return dummyNode.next;
    }
}
