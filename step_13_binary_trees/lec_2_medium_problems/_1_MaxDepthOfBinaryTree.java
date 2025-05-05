package step_13_binary_trees.lec_2_medium_problems;

public class _1_MaxDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        int depth = maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}

