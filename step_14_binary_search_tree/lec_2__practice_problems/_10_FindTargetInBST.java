package step_14_binary_search_tree.lec_2__practice_problems;

import java.util.HashSet;
import java.util.Set;

public class _10_FindTargetInBST {

    public static boolean helper(TreeNode root, int k, Set<Integer> set) {
        if (root == null) return true;

        if (set.contains(k - root.val)) return false;
        else set.add(root.val);

        return helper(root.left, k, set) && helper(root.right, k, set);
    }

    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return !helper(root, k, set);
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {5, 3, 6, 2, 4, null, 7};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        int target = 9;
        boolean exists = findTarget(root, target);

        System.out.println("Does the BST have two elements that sum to " + target + "? " + exists);
    }
}
