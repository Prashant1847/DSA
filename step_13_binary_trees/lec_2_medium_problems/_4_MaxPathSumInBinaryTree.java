package step_13_binary_trees.lec_2_medium_problems;

public class _4_MaxPathSumInBinaryTree {

    public static int maxSum(TreeNode root, int[] sum) {
        if (root == null) return 0;

        int lSum = maxSum(root.left, sum);
        int rSum = maxSum(root.right, sum);

        int throughRoot = root.val + lSum + rSum;
        sum[0] = Math.max(throughRoot, sum[0]);

        int newSum = root.val + Math.max(lSum, rSum);
        if (newSum < 0) newSum = 0;

        return newSum;
    }

    public static int maxPathSum(TreeNode root) {
        if (root.left == null && root.right == null) return root.val;
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        maxSum(root, sum);
        return sum[0];
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 3};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        int maxSum = maxPathSum(root);
        System.out.println("Maximum Path Sum in Binary Tree: " + maxSum);
    }
}
