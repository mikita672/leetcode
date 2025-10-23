public class _543_Diametr_of_Binary_Tree {

    public static void main(String[] args) {

    }

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

    int diametr;

    public int diameterOfBinaryTree(TreeNode root) {
        diametr = 0;
        helper(root);
        return diametr;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);
        diametr = Math.max(diametr, left + right);

        return Math.max(left, right) + 1;
    }
}
