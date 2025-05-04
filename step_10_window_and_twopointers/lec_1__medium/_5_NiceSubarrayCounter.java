package step_10_window_and_twopointers.lec_1__medium;

public class _5_NiceSubarrayCounter {

    private static int helper(int[] nums, int goal) {
        int l = 0, r = 0, oddCount = 0, count = 0;
        if (goal < 0) return 0;

        while (r < nums.length) {
            oddCount += (nums[r] & 1);
            while (oddCount > goal) {
                oddCount -= (nums[l] & 1);
                l = l + 1;
            }
            count = count + (r - l + 1);
            r = r + 1;
        }
        return count;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return (helper(nums, k) - helper(nums, k - 1));
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = numberOfSubarrays(nums, k);
        System.out.println("Number of nice subarrays with " + k + " odd numbers: " + result);
    }
}
