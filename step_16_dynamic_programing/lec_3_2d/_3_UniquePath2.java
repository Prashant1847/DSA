public class _3_UniquePath2 {
    public int findPath(int i, int j, int grid[][], int dp[][]){
        int m = grid.length, n = grid[0].length;
        if(i >= m ||  j >= n || grid[i][j] == 1) return 0;
        if(i == m - 1 && j == n - 1) return 1;

        if(dp[i][j] != 0) return dp[i][j];

        int count1 = findPath(i, j+1, grid, dp);
        int count2 = findPath(i+1, j, grid, dp);

        return dp[i][j] =  count1 + count2;

    }


    public int uniquePathsWithObstacles(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];

        return findPath(0, 0, grid, dp);
    }
}