package step_15_graphs.lec_4_shortestPaths;

import java.util.*;

// User function Template for Java
class Pair{
    int node, dist; 
    
    Pair(int node, int dist){
        this.node = node;
        this.dist = dist;
    }
}


public class ShortestPath_directed {
    
    public void traverse(Pair element, boolean vis[],  Stack<Pair> st, ArrayList<Pair> adj[]){
        vis[element.node] = true;
        
        for(Pair item: adj[element.node]){
            if(!vis[item.node]) traverse(item, vis, st, adj);
        }
        
        st.push(element);
    }

    public int[] shortestPath(int V, int E, int[][] edges) {
        ArrayList<Pair> adj[] = new ArrayList[V];
        int dist[] = new int[V];
        
        for(int i = 0; i<V; i++) {
            adj[i] = new ArrayList<Pair>();
            dist[i] = Integer.MAX_VALUE;
        }
        
        dist[0] = 0;
        
        for(int i =  0; i<E; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            int weight = edges[i][2];
            
            adj[v1].add(new Pair(v2, weight));
        }
        
        boolean vis[] = new boolean[V];
        Stack<Pair> st = new Stack<>();
        
        
        
        traverse(new Pair(0, 0), vis, st, adj);
        
        
        
        while(!st.isEmpty()){
            Pair element = st.pop();

            for(Pair item: adj[element.node]){
                int newDistance = dist[element.node] + item.dist;
                
                if(newDistance < dist[item.node]){
                    dist[item.node] = newDistance;
                }
            }
        }
        
        for(int i = 0; i<V; i++){
            if(!vis[i]) dist[i] = -1;
        }
        
        return dist;
    }
}