public class _4_HouseRobber{
 
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int max0 = 0, max1 = nums[0], max2 = nums[1];
        int maxRobberyAmount = Math.max(max1, max2);

        for(int i = 2; i<nums.length; i++){
            int robberyAmount1 = nums[i] + max0;
            int robberAmount2 = nums[i] + max1;

            int curr = Math.max(robberyAmount1, robberAmount2);
            maxRobberyAmount = Math.max(curr, maxRobberyAmount);
            max0 = max1;
            max1 = max2;
            max2 = curr;
        }

        return maxRobberyAmount;
    }
    
}