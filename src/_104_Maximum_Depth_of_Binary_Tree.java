public class _104_Maximum_Depth_of_Binary_Tree {
    public static void main(String[] args) {

    }


    //      Definition for a binary tree node.
    public class TreeNode {
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


    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);

        return Math.max(left_height, right_height) + 1;
    }
}
