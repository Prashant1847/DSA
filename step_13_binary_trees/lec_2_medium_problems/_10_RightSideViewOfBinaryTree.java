package step_13_binary_trees.lec_2_medium_problems;

import java.util.*;

public class _10_RightSideViewOfBinaryTree {

    private static void helper(TreeNode root, List<Integer> arr, int row) {
        if (root == null) return;

        if (arr.size() < row) arr.add(root.val);
        else arr.set(row - 1, root.val); // overwriting left with right

        helper(root.left, arr, row + 1);
        helper(root.right, arr, row + 1);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(root, arr, 1);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 3, null, 5, null, 4};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        List<Integer> view = rightSideView(root);
        System.out.println("Right side view of the binary tree: " + view);
    }
}
