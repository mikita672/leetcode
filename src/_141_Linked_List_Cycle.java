public class _141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode first1 = new ListNode(3);
        ListNode first2 = new ListNode(2);
        ListNode first3 = new ListNode(0);
        ListNode first4 = new ListNode(-4);
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first3.next = first1;
        System.out.println(hasCycle(first1));

        ListNode second1 = new ListNode(1);
        ListNode second2 = new ListNode(2);
        second1.next = second2;
        second2.next = second1;
        System.out.println(hasCycle(second1));

        ListNode third1 = new ListNode(1);
        System.out.println(hasCycle(third1));
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            if(slow == fast){
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
