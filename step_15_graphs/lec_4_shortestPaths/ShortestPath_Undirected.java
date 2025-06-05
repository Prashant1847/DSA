package step_15_graphs.lec_4_shortestPaths;

import java.util.*;


public class ShortestPath_Undirected {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int v = adj.size();
        boolean vis[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        int dist[] = new int[v];
        
        for(int i = 0; i<v; i++) dist[i] = -1;
        
        
        q.add(src);
        vis[src] = true;
        
        int distance = 0;
        int size = q.size();
        
        
        while(!q.isEmpty()){
            int node = q.poll();
            dist[node] = distance;
            
            for(Integer item: adj.get(node)){
                if(!vis[item]){
                  q.add(item);
                  vis[item] = true;
                } 
            }
            
            
            size--;
            if(size == 0){
                distance++;
                size = q.size();
            }
            
        }
        
        return dist;
    }
}
