package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.List;

public class _10_CombinationSum3{

    private static void findCombinations(int[] nums, List<List<Integer>> ans, List<Integer> ds, int k, int i, int target) {
        if (ds.size() == k) {
            if (target == 0) ans.add(new ArrayList<>(ds));
            return;
        }

        if (i == nums.length || target < 0) return;

        // Pick the current number
        ds.add(nums[i]);
        findCombinations(nums, ans, ds, k, i + 1, target - nums[i]);
        ds.remove(ds.size() - 1);

        // Skip the current number
        findCombinations(nums, ans, ds, k, i + 1, target);
    }

    public static List<List<Integer>> combinationSum3(int k, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findCombinations(nums, ans, new ArrayList<>(), k, 0, target);
        return ans;
    }

    public static void main(String[] args) {
        int k = 3, target = 7;
        List<List<Integer>> result = combinationSum3(k, target);
        System.out.println("Combinations of " + k + " numbers that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
