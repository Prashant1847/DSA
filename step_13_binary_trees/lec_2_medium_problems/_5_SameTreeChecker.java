package step_13_binary_trees.lec_2_medium_problems;

public class _5_SameTreeChecker {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if ((p != null && q == null) || (p == null && q != null)) return false;

        if (p.val != q.val) return false;

        boolean result = isSameTree(p.left, q.left);
        if (result) return isSameTree(p.right, q.right);

        return result;
    }

    public static void main(String[] args) {
        Integer[] tree1 = {1, 2, 3};
        Integer[] tree2 = {1, 2, 3};

        TreeNode root1 = TreeNode.insertLevelOrder(tree1, 0);
        TreeNode root2 = TreeNode.insertLevelOrder(tree2, 0);

        boolean same = isSameTree(root1, root2);
        System.out.println("Are the two trees the same? " + same);
    }
}
