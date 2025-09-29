import java.util.ArrayList;
import java.util.List;

public class _144_Binary_Tree_Preorder_Traversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Recursive: " + preorderTraversal(root));
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
    }

    private static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        performPreorderDFS(root, result);
        return result;
    }

    private static void performPreorderDFS(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        performPreorderDFS(node.left, result);
        performPreorderDFS(node.right, result);
    }
}
