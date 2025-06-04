package step_15_graphs.lec_3_topological_sort;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortDFS {
    
    public static void traverse(int node, boolean vis[], Stack<Integer> st, ArrayList<Integer> adj[]){
        
        vis[node] = true;
        
        for(Integer item: adj[node]){
            if(!vis[item]) traverse(item, vis, st, adj);
        }
        
        st.push(node);
    }
    
    
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<Integer> adj[] = new ArrayList[V];
        
        for(int i = 0; i<V; i++){
            adj[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            
            adj[v1].add(v2);
        }
        
        
        boolean vis[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        
        
        for(int i = 0; i<V; i++){
            if(!vis[i]) traverse(i, vis, st, adj);
        }
        
        
        ArrayList<Integer> answer = new ArrayList<>();
        while(!st.isEmpty()){
            answer.add(st.pop());
        }
        
        return answer;
    }
}

