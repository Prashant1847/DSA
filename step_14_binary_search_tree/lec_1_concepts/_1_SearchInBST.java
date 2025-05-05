package step_14_binary_search_tree.lec_1_concepts;


public class _1_SearchInBST {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val == val) return root;
        else if (val < root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        // Constructing BST from level-order input
        Integer[] levelOrder = {4, 2, 7, 1, 3};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        System.out.print("In-order Traversal of BST: ");
        TreeNode.printInOrder(root);
        System.out.println();

        int target = 2;
        TreeNode result = searchBST(root, target);
        if (result != null) {
            System.out.println("Subtree rooted at " + target + ":");
            TreeNode.printInOrder(result);
        } else {
            System.out.println("Value " + target + " not found in BST.");
        }
    }
}

