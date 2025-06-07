
public class FloydWarshall {
    public void floydWarshall(int[][] dist) {

        // before this you can set the non reachable node to infinity and diagonal ones distance to 0
        int n = dist.length;
        
        for(int k = 0; k<n; k++){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    if(dist[i][k] != 1e8 && dist[k][j] != 1e8){
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }


        //after this check all the diagonals distance to detect negative weigh cycle
        //if any distance is < 0 then there is negative cycle in the graph 

    }
}

