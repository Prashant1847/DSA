package step_13_binary_trees.lec_2_medium_problems;

public class _11_SymmetricTreeChecker {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p != null && q == null) || (p == null && q != null)) return false;

        if (p.val != q.val) return false;

        boolean result = isSameTree(p.left, q.right);
        if (result) return isSameTree(p.right, q.left);

        return result;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameTree(root.left, root.right);
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        boolean symmetric = isSymmetric(root);
        System.out.println("Is the tree symmetric? " + symmetric);
    }
}

