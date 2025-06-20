package step_16_dynamic_programing.lec_4_subsequences;

import java.util.Arrays;

public class _4_CountSubsetOfK {
    
     public int find(int ind, int target, int arr[], int dp[][]){
        if(ind >= arr.length) return target == 0 ? 1 : 0;
        
        if(dp[ind][target] != -1) return dp[ind][target];
        
        
        int take = 0;
        if(arr[ind] <= target){
            take = find(ind + 1, target - arr[ind], arr, dp);
        }
        
        int notTake = find(ind + 1, target, arr, dp);
        
        
        dp[ind][target] = notTake + take;
        
        return take + notTake;
    }
    
    
    public int perfectSum(int[] nums, int target) {
        
        int dp[][] = new int[nums.length][target + 1];
        for(int i = 0; i<dp.length; i++) Arrays.fill(dp[i], -1);
        
        return find(0, target, nums, dp);
    }
}