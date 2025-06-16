public class _2_UniquePath {

    public int findPath(int i, int j, int m, int n, int dp[][]){
        if(i >= m ||  j >= n) return 0;
        if(i == m-1 && j == n - 1) return 1;
        if(dp[i][j] != 0) return dp[i][j];

        int count1 = findPath(i, j+1, m, n, dp);
        int count2 = findPath(i+1, j, m, n, dp);

        int value = count1 + count2;

        dp[i][j] = value;
        return value;
    }


    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return findPath(0, 0, m, n, dp);
    }
}
