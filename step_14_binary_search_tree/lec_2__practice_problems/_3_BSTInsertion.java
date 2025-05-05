package step_14_binary_search_tree.lec_2__practice_problems;

public class _3_BSTInsertion {

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    public static void main(String[] args) {
        // Start with an existing BST
        Integer[] levelOrder = {8, 4, 12, 2, 6, 10, 14};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("BST before insertion: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int valueToInsert = 5;
        root = insertIntoBST(root, valueToInsert);

        System.out.print("BST after inserting " + valueToInsert + ": ");
        TreeNode.printInOrder(root);
        System.out.println();
    }
}
