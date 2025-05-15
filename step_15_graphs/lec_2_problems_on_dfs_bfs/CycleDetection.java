package step_15_graphs.lec_2_problems_on_dfs_bfs;

import java.util.ArrayList;

class Solution {
    
    private boolean traverse(int node, ArrayList<Integer> adj[], boolean vis[], int prevVertex){
        vis[node] = true;
        // System.out.println("node -> "+node);
         for(Integer it: adj[node]){
            if(!vis[it]){
            //   System.out.println("traversing on  -> "+it);
              boolean result = traverse(it, adj, vis, node);  
              if (result) return true;
            } 
            else if(vis[it] && prevVertex != it) return true;
        }
        return false;
    }
    
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<Integer> adj[] = new ArrayList[V];
        
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            if(adj[v1] == null) adj[v1] = new ArrayList<Integer>();
            if(adj[v2] == null) adj[v2] = new ArrayList<Integer>();
            
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
        
        // for(int i = 0; i<V; i++){
        //     System.out.print("i -> "+i);
        //     for(Integer it: adj[i]){
        //         System.out.print(it+", ");
        //     }
        //     System.out.println();
        // }
        
        boolean vis[] = new boolean[V];
        for(int i = 0; i<edges.length; i++){
            int startingNode = edges[i][0];
            if(!vis[startingNode]){
                boolean result = traverse(startingNode, adj, vis, -1);
                if(result) return true;
            }
        }
        return false;
    }
}