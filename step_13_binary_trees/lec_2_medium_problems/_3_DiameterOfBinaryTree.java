package step_13_binary_trees.lec_2_medium_problems;

public class _3_DiameterOfBinaryTree {

    public static int height(TreeNode root, int[] diameter) {
        if (root == null) return 0;

        int leftHeight = height(root.left, diameter);
        int rightHeight = height(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        diameter[0] = 0;
        height(root, diameter);
        return diameter[0];
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 3, 4, 5};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        int diameter = diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}
