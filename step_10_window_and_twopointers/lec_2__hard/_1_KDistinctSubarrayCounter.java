package step_10_window_and_twopointers.lec_2__hard;

import java.util.HashMap;
import java.util.Map;

public class _1_KDistinctSubarrayCounter {

    private static int helper(int nums[], int k) {
        int l = 0, r = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                int value = nums[l];
                if (map.get(value) - 1 == 0) map.remove(value);
                else map.put(value, map.get(value) - 1);
                l++;
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return (helper(nums, k) - helper(nums, k - 1));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly " + k + " distinct integers: " + result);
    }
}
