package step_13_binary_trees.lec_1__traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Node class for
// the binary tree
class Node {
    int data;
    Node left;
    Node right;
    
    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class _1_to_4_Traversals{
    // Function to perform preorder traversal
    // of the tree and store values in 'arr'
    static void preorder(Node root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        preorder(root.left, arr);
        preorder(root.right, arr);
    }


    static void inorder(Node root, List<Integer> arr){
        if(root == null) return;

        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    static void postorder(Node root, List<Integer> arr){
        if(root == null) return;

        postorder(root.left, arr);
        postorder(root.right, arr);
        arr.add(root.data);
    }


    // Function to initiate preorder traversal
    // and return the resulting list
    static List<Integer> preOrder(Node root) {
        List<Integer> arr = new ArrayList<>();
        preorder(root, arr);
        return arr;
    }

    static List<Integer> inOrder(Node root) {
        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }

    static List<Integer> postOrder(Node root) {
        List<Integer> arr = new ArrayList<>();
        postorder(root, arr);
        return arr;
    }


    static List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(root == null) return wrapList;

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> sublist = new LinkedList<>();

            for(int i = 0; i<levelNum; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                sublist.add(queue.poll().data);
            }

            wrapList.add(sublist);
        }
        return wrapList;
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> preorder_traversal = preOrder(root);
        List<Integer> postorder_traversal= postOrder(root);
        List<Integer> inorder_traversal = inOrder(root);

        System.out.print("Preorder Traversal: ");
        for (int val : preorder_traversal) {
            System.out.print(val + " ");
        }

        System.out.println();
        System.out.print("Inorder Traversal: ");
        for (int val : inorder_traversal) {
            System.out.print(val + " ");
        }

        System.out.println();
        System.out.print("PostOrder Traversal: ");
        for (int val : postorder_traversal) {
            System.out.print(val + " ");
        }
        System.out.println();


        System.out.println("Level order Traversal:");
        List<List<Integer>> levelOrder_Traversal = levelOrder(root);
        for(List<Integer> level: levelOrder_Traversal){
            System.out.println(level);
        }
    }
}