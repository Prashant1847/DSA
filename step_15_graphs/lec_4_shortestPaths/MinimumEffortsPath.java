package step_15_graphs.lec_4_shortestPaths;

import java.util.*;

class Triplet{
    int x, y, distance;
    Triplet(int x, int y, int distance){
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}


public class MinimumEffortsPath {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int dist[][] = new int[rows][cols];

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++) dist[i][j] = Integer.MAX_VALUE;
        }

        dist[0][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        pq.add(new Triplet(0, 0, 0));

        int drows[] = {0, 0, 1, -1};
        int dcols[] = {1, -1, 0, 0};

        while(pq.size() != 0){
            int distance = pq.peek().distance;
            int x = pq.peek().x;
            int y = pq.peek().y;
            pq.remove();

            if(x == rows - 1 && y == cols - 1) return distance;

            for(int i = 0; i<4; i++){
                int nx = x + drows[i];
                int ny = y + dcols[i];

                if(nx >= 0 && nx < rows && ny >= 0 && ny < cols){
                    int adjAbsDifference = Math.abs(heights[x][y] - heights[nx][ny]);
                    int maxAbsDiff = Math.max(adjAbsDifference, distance);

                    if(maxAbsDiff < dist[nx][ny]){
                        dist[nx][ny] = maxAbsDiff;
                        pq.add(new Triplet(nx, ny, maxAbsDiff));
                    }
                }
            }
        }
        return 0;
    }
}