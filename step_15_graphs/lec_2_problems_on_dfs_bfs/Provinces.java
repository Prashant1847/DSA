package step_15_graphs.lec_2_problems_on_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Provinces {

    private void traverse(int node, boolean vis[], int[][] adj){
        Queue<Integer> q = new LinkedList<>();

        q.add(node);
        vis[node] = true;

        while(!q.isEmpty()){
            Integer element = q.poll();
            for(int i = 0; i<adj.length; i++){
                if(adj[element][i] == 1 && !vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    }


    public int findCircleNum(int[][] isConnected) {
        int provinces = 0, n = isConnected.length;
        boolean vis[] = new boolean[n];

        for(int i = 0; i<n; i++){
            if(!vis[i]){
                provinces++;
                traverse(i, vis, isConnected);
            }
        }

        return provinces;
    }
}