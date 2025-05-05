package step_14_binary_search_tree.lec_2__practice_problems;

public class _11_RecoverBinarySearchTree {

    static TreeNode first = null;
    static TreeNode middle = null;
    static TreeNode last = null;
    static TreeNode prev = null;

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && (root.val < prev.val)) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;

        inorder(root.right);
    }

    public static void recoverTree(TreeNode root) {
        first = middle = last = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);

        if (first != null && last != null) {
            int t = first.val;
            first.val = last.val;
            last.val = t;
        } else if (first != null && middle != null) {
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }

    public static void main(String[] args) {
        // BST with swapped nodes: 1 and 3
        Integer[] levelOrder = {3, 1, 4, null, null, 2}; // Should be 2 and 3 swapped
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order before recovery: ");
        TreeNode.printInOrder(root);
        System.out.println();

        recoverTree(root);

        System.out.print("In-order after recovery: ");
        TreeNode.printInOrder(root);
        System.out.println();
    }
}
