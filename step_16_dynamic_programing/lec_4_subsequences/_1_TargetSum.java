package step_16_dynamic_programing.lec_4_subsequences;

public class _1_TargetSum{
    

    static Boolean isSubsetSum(int arr[], int sum) {
        
        boolean dp[][] = new boolean[arr.length][sum + 1];
        
        for(int i = 0; i<arr.length; i++) dp[i][0] = true;
        
        if(arr[0] <= sum) dp[0][arr[0]] = true;
        
        for(int i = 1; i< arr.length; i++){
            for(int target = 1; target <= sum; target++){
                boolean notTake = dp[i - 1][target];
                
                boolean take = false;
                if(arr[i] <= target){
                    take = dp[i - 1][target - arr[i]];
                }
                
                dp[i][target] = take | notTake;
            }
        }
        
        return dp[arr.length - 1][sum];
    }
}