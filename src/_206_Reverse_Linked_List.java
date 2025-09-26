public class _206_Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode first5 = new ListNode(5);
        ListNode first4 = new ListNode(4, first5);
        ListNode first3 = new ListNode(3, first4);
        ListNode first2 = new ListNode(2, first3);
        ListNode first1 = new ListNode(1, first2);
        printList(first1);
        ListNode firstReversed = reverseList(first1);
        printList(firstReversed);
    }

    private static class ListNode {
        int val;
        ListNode next;

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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(Integer.toString(head.val) + ' ');
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode reverseList(ListNode head) {
        ListNode dummyNode = new ListNode();

        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;

            current.next = dummyNode.next;

            dummyNode.next = current;

            current = nextNode;
        }

        return dummyNode.next;
    }
}
