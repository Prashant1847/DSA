package step_15_graphs.lec_2_problems_on_dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int parent, node;
    
    Pair(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
}


 class CycleDetectionUndirected{
    
    private boolean traverse(int node, ArrayList<Integer> adj[], boolean vis[]){
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(node, -1));
        vis[node] = true;
        
        while(!q.isEmpty()){
            Pair element = q.poll();
            
            for(Integer it: adj[element.node]){
                if(!vis[it]){
                    q.add(new Pair(it, element.node));
                    vis[it] = true;
                }else if(element.parent!= it) return true;
            }
            
            
        }
        
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // List creation
        ArrayList<Integer> adj[] = new ArrayList[V];
        
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            if(adj[v1] == null) adj[v1] = new ArrayList<Integer>();
            if(adj[v2] == null) adj[v2] = new ArrayList<Integer>();
            
            adj[v1].add(v2);
            adj[v2].add(v1);
        }
    
    
        boolean vis[] = new boolean[V];
        
        for(int i = 0; i<edges.length; i++){
            int startingNode = edges[i][0];
            if(!vis[startingNode]){
                if( traverse(startingNode, adj, vis) ) return true;
            }
        }
        return false;
    }
}