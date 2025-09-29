
public class _112_Path_Sum {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unused")
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

        private static boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null)
                return false;

            int subSum = targetSum - root.val;
            boolean left = false, right = false;

            if (subSum == 0 && root.left == null && root.right == null) {
                return true;
            }

            if (root.left != null)
                left = hasPathSum(root.left, subSum);
            if (root.right != null)
                right = hasPathSum(root.right, subSum);

            return left || right;
        }
    }
}
