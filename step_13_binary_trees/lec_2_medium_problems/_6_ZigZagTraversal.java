package step_13_binary_trees.lec_2_medium_problems;

import java.util.*;

public class _6_ZigZagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean lr = true;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ans;

        q.add(root);

        while(!q.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            int size = q.size();

            for(int i = 0; i<size; i++){
                if(lr) arr.add(q.peek().val);
                else arr.add(0, q.peek().val);
                

                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);

                q.remove();
            }

            lr = !lr;
            ans.add(arr);
        }
        return ans;
    }
}
