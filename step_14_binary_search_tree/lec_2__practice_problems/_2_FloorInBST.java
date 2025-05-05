package step_14_binary_search_tree.lec_2__practice_problems;

import step_14_binary_search_tree.lec_1_concepts.TreeNode;

public class _2_FloorInBST {

    public static int floor(TreeNode root, int key) {
        if (root == null) return -1;
        int floor = -1;

        while (root != null) {
            if (key == root.val) {
                floor = root.val;
                break;
            } else if (key > root.val) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return floor;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {8, 4, 12, 2, 6, 10, 14};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal of BST: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int key = 11;
        int result = floor(root, key);
        System.out.println("Floor of " + key + " in BST is: " + result);
    }
}
