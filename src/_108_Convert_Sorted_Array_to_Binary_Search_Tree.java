public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public static void main(String[] args) {

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecur(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBSTRecur(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(arr[mid]);

        root.left = sortedArrayToBSTRecur(arr, start, mid - 1);
        root.right = sortedArrayToBSTRecur(arr, mid + 1, end);

        return root;
    }
}
