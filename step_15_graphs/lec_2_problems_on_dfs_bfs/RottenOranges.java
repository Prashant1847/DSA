package step_15_graphs.lec_2_problems_on_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length, cols = grid[0].length;
        int minutes = 0;
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2) q.add(new int[]{i, j});
            }
        }

        int currentRottenCount = q.size();
        boolean rotten = false;

        int drow[] = {-1, 0, 1, 0};
        int dcols[] = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int[] rottedOrange = q.poll();
            int i = rottedOrange[0], j = rottedOrange[1];

            for(int d = 0; d<4; d++){
                int nrow = i + drow[d];
                int ncol = j + dcols[d];

                if(nrow >= 0 && nrow < rows && ncol >= 0 && ncol < cols && grid[nrow][ncol] == 1){
                    grid[nrow][ncol] =  2;
                    rotten = true;
                    q.add(new int[]{nrow, ncol});
                }
            }
            
            --currentRottenCount;
            if(rotten && currentRottenCount == 0) {
                currentRottenCount = q.size();
                rotten = false;
                minutes++;
            }
        }

         for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1) return -1;
            }
        }
    
        return minutes;
    }
}
