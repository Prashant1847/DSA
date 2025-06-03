package step_15_graphs.lec_2_problems_on_dfs_bfs;

public class Bipartite {

    private boolean dfs(int node, int setNumber, int vis[], int[][] graph){
        if(vis[node] != 0){
            return setNumber == vis[node]; //checks if the visited node belongs to the expected set number or not
        }

        vis[node] = setNumber;

        for(int item: graph[node]){
            if(!dfs(item, 3 - setNumber, vis, graph)) return false;
        }

        return true;
    }


    public boolean isBipartite(int[][] graph) {
        int vis[] = new int[graph.length];

        for(int i = 0; i<graph.length; i++){
            if(vis[i] == 0){
                if(!dfs(i, 1, vis, graph) ) return false;
            }
        }

        return true;
    }
}