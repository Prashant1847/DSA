package step_14_binary_search_tree.lec_2__practice_problems;

import java.util.Stack;

public class _9_BSTIterator {
    Stack<TreeNode> st;

    private void insertion(TreeNode root){
        if(root == null) return;
        st.push(root);
        insertion(root.left);
    }
    public _9_BSTIterator(TreeNode root) {
        st = new Stack<>();
        insertion(root);
    }

    public int next() {
        TreeNode topNode = st.pop();
        insertion(topNode.right);
        return topNode.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
}