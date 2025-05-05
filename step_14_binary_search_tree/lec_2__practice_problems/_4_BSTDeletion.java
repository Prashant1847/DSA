package step_14_binary_search_tree.lec_2__practice_problems;

public class _4_BSTDeletion {

    public static TreeNode findSuccessor(TreeNode root) {
        if (root.left == null) return root;
        return findSuccessor(root.left);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                TreeNode successor = findSuccessor(root.right);
                root.val = successor.val;
                root.right = deleteNode(root.right, successor.val);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {8, 4, 12, 2, 6, 10, 14};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order traversal before deletion: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int deleteVal = 4;
        root = deleteNode(root, deleteVal);

        System.out.print("In-order traversal after deleting " + deleteVal + ": ");
        TreeNode.printInOrder(root);
        System.out.println();
    }
}
