package step_14_binary_search_tree.lec_2__practice_problems;

public class _6_ValidateBST {

    public static boolean helper(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (!(root.val > low && root.val < high)) return false;

        return helper(root.left, low, root.val) && helper(root.right, root.val, high);
    }

    public static boolean isValidBST(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {10, 5, 15, null, null, 6, 20}; // Not a valid BST
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal: ");
        TreeNode.printInOrder(root);
        System.out.println();

        boolean isValid = isValidBST(root);
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
