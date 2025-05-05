package step_13_binary_trees.lec_2_medium_problems;

import java.util.*;

class Pair<U, V> {
    public U dataNode;
    public V column;

    public Pair(U first, V second) {
        this.dataNode = first;
        this.column = second;
    }
}

public class _9_TopViewOfBinaryTree {

    public static ArrayList<Integer> topView(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();

        if (root == null) return arr;

        queue.offer(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> front = queue.poll();

            if (!sortedMap.containsKey(front.column)) {
                sortedMap.put(front.column, front.dataNode.val);
            }

            if (front.dataNode.left != null)
                queue.offer(new Pair<>(front.dataNode.left, front.column - 1));
            if (front.dataNode.right != null)
                queue.offer(new Pair<>(front.dataNode.right, front.column + 1));
        }

        arr.addAll(sortedMap.values());
        return arr;
    }

    public static void main(String[] args) {
        Integer[] levelOrder = {1, 2, 3, null, 5, null, 4};
        TreeNode root = TreeNode.insertLevelOrder(levelOrder, 0);

        ArrayList<Integer> view = topView(root);
        System.out.println("Top view of the binary tree: " + view);
    }
}
