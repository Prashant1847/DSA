package step_10_window_and_twopointers.lec_1__medium;

public class _4_SubarraySumCounter {

    private static int helper(int arr[], int goal) {
        if (goal < 0) return 0;
        int left = 0, right = 0, count = 0, sum = 0;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > goal) {
                sum -= arr[left];
                left++;
            }

            count += right - left + 1;
            right++;
        }
        return count;
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums, goal) - helper(nums, goal - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum " + goal + ": " + result);
    }
}
