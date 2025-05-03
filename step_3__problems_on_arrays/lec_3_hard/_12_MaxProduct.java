package step_3__problems_on_arrays.lec_3_hard;

public class _12_MaxProduct {

    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1, n = nums.length;

        for (int i = 0; i < n; i++) {
            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};  // Sample input
        int result = maxProduct(nums);
        System.out.println("Maximum product of a subarray: " + result);
    }
}

