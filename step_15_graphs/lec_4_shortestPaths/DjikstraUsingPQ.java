package step_15_graphs.lec_4_shortestPaths;

import java.util.*;


class Pair{
    int node, distance;
    
    Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}


public class DjikstraUsingPQ {
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<Pair> adj[] = new ArrayList[V];
        int dist[] = new int[V];
        
        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            adj[i] = new ArrayList<Pair>();
        }
        
        for(int i = 0; i<edges.length; i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            int distance = edges[i][2];
            
            adj[v1].add(new Pair(distance, v2));
        }
        
        dist[src] = 0;
        
        
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        
        pq.add(new Pair(0, src));
        
        while(pq.size() != 0){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            for(Pair item: adj[node]){
                int edgeWeight = item.distance;
                int adjNode = item.node;
                
                if(dis + edgeWeight < dist[adjNode]){
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        
        return dist;
    }
}