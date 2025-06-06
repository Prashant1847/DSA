package step_15_graphs.lec_4_shortestPaths;

import java.util.*;

class Tuple{
    int stop, node, cost;

    Tuple(int stop, int node, int cost){
        this.stop = stop;
        this.node = node;
        this.cost = cost;
    }
}

class Pair{
    int node, cost;
    Pair(int node, int cost){
        this.node = node;
        this.cost = cost;
    }
}


class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Pair> adj[] = new ArrayList[n];
        int costs[] = new int[n];
        
        for(int i = 0; i<n; i++){
            costs[i] = Integer.MAX_VALUE;
            adj[i] = new ArrayList<Pair>();
        }
        
        for(int i = 0; i<flights.length; i++){
            int v1 = flights[i][0];
            int v2 = flights[i][1];
            int cost = flights[i][2];
            
            adj[v1].add(new Pair(v2, cost));
        }
        
        costs[src] = 0;

        Queue<Tuple> pq = new LinkedList<>();

        pq.add(new Tuple(0, src, 0));

        while(pq.size() != 0){
            Tuple element = pq.poll();
            int stop = element.stop;
            int city = element.node;
            int cost = element.cost;

            if(stop > k) return costs[dst];

            for(Pair item: adj[city]){
                if(city == dst || (stop == k && item.node != dst)) continue;

                if(item.cost + cost < costs[item.node]){
                    costs[item.node] = item.cost + cost;
                    pq.add(new Tuple(stop + 1, item.node, costs[item.node]));
                }
            }
        }

        return costs[dst] == Integer.MAX_VALUE ? -1: costs[dst];
    }
}