public class _100_Same_Tree {
    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode tree1_1 = new TreeNode();
        tree1_1.val = 1;
        TreeNode tree1_2 = new TreeNode();
        tree1_2.val = 2;
        tree1_1.left = tree1_2;
        TreeNode tree1_3 = new TreeNode();
        tree1_3.val = 3;
        tree1_1.right = tree1_3;

        System.out.println(isSameTree(tree1_1, tree1_1));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
