public class _83_Remove_Duplicates_from_Sorted_List {
    public static void main(String[] args) {

    }


    //      Definition for singly-linked list.
    public class ListNode {
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


    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cursor = head;

        while (cursor.next != null) {
            if (cursor.next.val == cursor.val) {
                cursor.next = cursor.next.next;
            } else {
                cursor = cursor.next;
            }
        }
        return head;
    }
}
