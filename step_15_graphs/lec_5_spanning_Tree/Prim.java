
import java.util.*;

class Pair{
    int node;
    int distance;
    
    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}


public class Prim {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        
        int vis[] = new int[V];
        
        pq.add(new Pair(0, 0));
        int sum = 0;
        
        while(pq.size() != 0){
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            
            if(vis[node] == 1) continue;
            
            vis[node] = 1;
            sum += wt;
            
            for(int[] item: adj.get(node)){
                int adjNode = item[0];
                int edW = item[1];
                if(vis[adjNode] == 0){
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }
}