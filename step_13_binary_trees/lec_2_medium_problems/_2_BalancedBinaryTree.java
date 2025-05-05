package step_13_binary_trees.lec_2_medium_problems;

public class _2_BalancedBinaryTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (leftDepth < 0 || rightDepth < 0 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 2, 3, 3, null, null, 4, 4};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.println("Is the tree balanced? " + isBalanced(root));
    }
}

