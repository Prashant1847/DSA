package step_12_greedy.lec_2__medium;

public class _3_MinimumJumpsToEnd {

    public static int jump(int[] nums) {
        int maxIndex = nums[0];
        int checkPoint = maxIndex, jump = 0;

        for (int i = 1; i < nums.length; i++) {
            maxIndex = Math.max(maxIndex, nums[i] + i);

            if (i == checkPoint || i == nums.length - 1) {
                jump++;
                checkPoint = maxIndex;
            }
        }

        return jump;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int result = jump(nums);
        System.out.println("Minimum number of jumps to reach the end: " + result);
    }
}

