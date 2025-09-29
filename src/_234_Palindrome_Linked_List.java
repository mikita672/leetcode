import java.util.ArrayList;
import java.util.List;

public class _234_Palindrome_Linked_List {
    public static void main(String[] args) {
        ListNode first4 = new ListNode(1);
        ListNode first3 = new ListNode(2, first4);
        ListNode first2 = new ListNode(2, first3);
        ListNode first1 = new ListNode(1, first2);
        System.out.println(isPalindrome(first1));

        ListNode second2 = new ListNode(2);
        ListNode second1 = new ListNode(1, second2);
        System.out.println(isPalindrome(second1));
    }

    private static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }

        return left >= right;
    }
}

class ListNode {
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
