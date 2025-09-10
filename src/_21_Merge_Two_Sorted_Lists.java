public class _21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode();
        list1.next.val = 2;
        list1.next.next = new ListNode();
        list1.next.next.val = 4;

        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode();
        list2.next.val = 3;
        list2.next.next = new ListNode();
        list2.next.next.val = 4;

        ListNode list3 = mergeTwoLists(list1, list2);
    }


    // Definition for singly-linked list.
    public static class ListNode {
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

//    int getListSize(ListNode list){
//        int size = 0;
//        ListNode next = list;
//        while(next != null){
//            i
//        }
//    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode tail = result;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                tail.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tail = tail.next;
        }

        while (list1 != null) {
            tail.next = new ListNode(list1.val);
            list1 = list1.next;
            tail = tail.next;
        }

        while (list2 != null) {
            tail.next = new ListNode(list2.val);
            list2 = list2.next;
            tail = tail.next;
        }
        return result.next;
    }
}
