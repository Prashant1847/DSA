package step_14_binary_search_tree.lec_2__practice_problems;

public class _7_LowestCommonAncestorBST {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);

        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
