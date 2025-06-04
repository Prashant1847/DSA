package step_15_graphs.lec_3_topological_sort;

import java.util.*;

public class TopoSortBFS {
    
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        
        ArrayList<Integer> adj[] = new ArrayList[V];
        int indegree[] = new int[V];
        
        for(int i = 0; i<V; i++){
            adj[i] = new ArrayList<Integer>();
        }
        
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            
            adj[v1].add(v2);
            indegree[v2]++;
        }
        
                
       
       
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i<V; i++){
            if(indegree[i] == 0) q.add(i);
        }
        
        
        while(!q.isEmpty()){
            int node = q.poll();
            answer.add(node);
            
            
            for(Integer item: adj[node]){
                indegree[item]--;
                if(indegree[item] == 0) q.add(item);
            }
        }
        

        return answer;
    }
}