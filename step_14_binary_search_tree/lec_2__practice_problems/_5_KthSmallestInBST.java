package step_14_binary_search_tree.lec_2__practice_problems;

public class _5_KthSmallestInBST {

    public static int smallest(TreeNode root, int kth[]) {
        if (root == null) return -1;

        int result = smallest(root.left, kth);
        if (kth[0] == 0) return result;
        if (--kth[0] == 0) return root.val;

        if (kth[0] > 0) return smallest(root.right, kth);
        return result;
    }

    public static int kthSmallest(TreeNode root, int k) {
        int kth[] = {k};
        return smallest(root, kth);
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {8, 4, 12, 2, 6, 10, 14};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal of BST: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int k = 4;
        int result = kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element in BST is: " + result);
    }
}
