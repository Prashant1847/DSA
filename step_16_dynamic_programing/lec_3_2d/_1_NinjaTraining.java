public class _1_NinjaTraining{

    public int training(int row, int col, int arr[][], int dp[][]){
        
        if(row >= arr.length) return 0;
        
        int maxi = Integer.MIN_VALUE;
        
        
        for(int i = 0; i<3; i++){
            if(i != col){ //skip the activity selected previously
                int value;
                
                if(dp[row][i] != 0) value = dp[row][i];
                else{
                    value = arr[row][i] + training(row + 1, i, arr, dp);
                    dp[row][i] = value;
                }
                
                maxi = Math.max(maxi, value);
            }
        }
        
        return maxi;
    }
    
    
    public int maximumPoints(int arr[][]) {
        int dp[][] = new int[arr.length][3]; //3 for activities
        return training(0, -1, arr, dp);
    }
}