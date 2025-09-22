import java.util.ArrayList;
import java.util.List;

public class _145_Binary_Tree_Postorder_Traversal {
    public static void main(String[] args) {
        TreeNode first1 = new TreeNode(1);
        TreeNode first2 = new TreeNode(2);
        TreeNode first3 = new TreeNode(3);
        first1.right = first2;
        first2.left = first3;
        System.out.println(postorderTraversal(first1));
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

    private static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    private static void dfs(TreeNode node, List<Integer> res) {
        if (node == null)
            return;

        dfs(node.left, res);
        dfs(node.right, res);
        res.add(node.val);
    }
}
