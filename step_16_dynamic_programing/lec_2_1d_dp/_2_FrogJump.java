import java.util.*;


class _2_FrogJump {
    
    int jump(int n, int height[], int dp[]){
        if(n == 0) return 0;
        if(n == 1) return Math.abs(height[1] - height[0]);
        
        if(dp[n] != -1) return dp[n];
        
        int cost1 = Math.abs(height[n] - height[n-1]) + jump(n-1, height, dp);
        int cost2 = Math.abs(height[n] - height[n-2]) + jump(n-2, height, dp);
        
        int minCost = Math.min(cost1, cost2);
        dp[n] = minCost;
        return minCost;
    }
    
    int minCost(int[] height) {
        int dp[] = new int[height.length];
        Arrays.fill(dp, -1);
        
        return jump(height.length - 1, height, dp);
    }
}