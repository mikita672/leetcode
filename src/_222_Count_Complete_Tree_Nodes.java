public class _222_Count_Complete_Tree_Nodes {
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

    private static int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }

    private static int countNodes(TreeNode root) {
        int h = height(root);

        return h < 0 ? 0 : height(root.right) == h - 1 ? (1 << h) + countNodes(root.right) : (1 << h - 1) + countNodes(root.left);
    }
}
