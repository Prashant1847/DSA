package step_14_binary_search_tree.lec_1_concepts;

public class _2_MinValueInBST {

    // Function to find the minimum element in the given BST.
    public static int minValue(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null) return minValue(root.left);
        else return root.val;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {8, 4, 10, 2, 6, null, 20};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal of BST: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int min = minValue(root);
        System.out.println("Minimum value in BST: " + min);
    }
}

