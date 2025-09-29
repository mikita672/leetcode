public class _203_Remove_Linked_List_Elements {
    public static void main(String[] args) {
        ListNode first1 = new ListNode(1);
        ListNode first2 = new ListNode(2);
        ListNode first3 = new ListNode(6);
        ListNode first4 = new ListNode(3);
        ListNode first5 = new ListNode(4);
        ListNode first6 = new ListNode(5);
        ListNode first7 = new ListNode(6);
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first4.next = first5;
        first5.next = first6;
        first6.next = first7;
        removeElements(first1, 6);

        ListNode second4 = new ListNode(1);
        ListNode second3 = new ListNode(2, second4);
        ListNode second2 = new ListNode(2, second3);
        ListNode second1 = new ListNode(1, second2);
        removeElements(second1, 2);
    }

    private static class ListNode {
        int val;
        ListNode next;

        @SuppressWarnings("unused")
        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return null;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
