package step_14_binary_search_tree.lec_2__practice_problems;

import step_14_binary_search_tree.lec_1_concepts.TreeNode;

public class _1_CeilInBST {

    // Function to return the ceil of given number in BST.
    public static int findCeil(TreeNode root, int key) {
        if (root == null) return -1;
        int ceil = -1;

        while (root != null) {
            if (key == root.val) {
                ceil = root.val;
                break;
            } else if (key < root.val) {
                ceil = root.val;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {
        // Constructing BST from level-order input
        Integer[] levelOrder = {8, 4, 12, 2, 6, 10, 14};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal of BST: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int key = 5;
        int result = findCeil(root, key);
        System.out.println("Ceil of " + key + " in BST is: " + result);
    }
}

