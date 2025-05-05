package step_13_binary_trees.lec_1__traversals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class _5_6_IterativeTraversals{
    // Function to perform preorder traversal
    // of the tree and store values in 'arr'


    //Node left right 
    public static List<Integer> preorder(Node root){
        List<Integer> traversal = new ArrayList<>();
        if(root == null) return traversal;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()){
            root = stack.pop();

            traversal.add(root.data);

            //now right is pushed first and then the left node because
            //while popping the element we need the first element to be the left node
            //as we are traversaing node, left, right 
            //not node, right, left
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return traversal;
    }


    //Left Node right
    public static List<Integer> inorder(Node root){
        List<Integer> traversal = new ArrayList<>();
        if(root == null) return traversal;

        Stack<Node> stack = new Stack<>();
        Node node = root;


        while(true){
            //when node not null push into stack and move left do not print now 
            //as we want to go to extreme left
            if(node != null){
                stack.push(node);
                node = node.left;
            }else{
                //now node will becomes null when it will reach extreme left
                //then we will pop the element who caused the element to be null
                //as it will either be the leftmost node or the root node of that subtree
                

                //now when the node will become null if is traverses to right 
                //then the root node of that subtree is already poped when we went to left most node
                //therefore this time the node will be popped of the upper subtree 
                //then we will begin processing that node's right tree 
                if(stack.empty()) break;
                node = stack.pop();
                traversal.add(node.data);
                node = node.right;
            }
        }

        return traversal;
    }


    //Left Right Node
    public static List<Integer> postOrder(Node root){
        List<Integer> traversal = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();


        if(root == null) return traversal;

        st1.push(root);
        while (!st1.empty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()) {
            traversal.add(st2.pop().data);
        }
        return traversal;
    }

    //using ONLY 1 STACK 
    public static List<Integer> postOrder_1Stack(Node root){
        List<Integer> traversal = new ArrayList<>();
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();


        if(root == null) return traversal;

        st1.push(root);
        while (!st1.empty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()) {
            traversal.add(st2.pop().data);
        }
        return traversal;
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

        System.out.println("Preorder Traversal");
        List<Integer> traversal = preorder(root);
        System.out.println(traversal);

        System.out.println();

        System.out.println("Inorder Traversal");
        List<Integer> inorder_traversal = inorder(root);
        System.out.println(inorder_traversal);


        System.out.println();
        System.out.println("Post Traversal using 2 stack");
        List<Integer> post_order  = postOrder(root);
        System.out.println(post_order);

    }  
}