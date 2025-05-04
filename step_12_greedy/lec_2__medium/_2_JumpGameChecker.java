package step_12_greedy.lec_2__medium;

public class _2_JumpGameChecker {

    public static boolean canJump(int[] nums) {
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxIndex) return false;
            maxIndex = Math.max(maxIndex, nums[i] + i);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = canJump(nums);
        System.out.println("Can reach the last index? " + result);
    }
}

