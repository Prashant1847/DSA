package step_10_window_and_twopointers.lec_1__medium;

public class _2_LongestOnesWithKFlips {

    public static int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int maxLen = 0;

        while (j < n) {
            int bit = nums[j];

            if (k > 0 && bit == 0) {
                k--;
            } else if (k == 0 && bit == 0) {
                while (nums[i] != 0) i++;
                i++; // leaving the first flipped zero
            }

            maxLen = (j - i + 1) > maxLen ? (j - i + 1) : maxLen;
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        int result = longestOnes(nums, k);
        System.out.println("Longest subarray of 1s after flipping at most " + k + " zeros: " + result);
    }
}

