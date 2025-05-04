package step_7_recursion.lec_2_subsequence;
import java.util.ArrayList;
import java.util.List;

public class _6_CombinationSum {

    private static void generateSubsets(int[] nums, List<List<Integer>> set, List<Integer> subset, int index, int target) {
        if (target == 0) {
            set.add(new ArrayList<>(subset));
            return;
        }
        if (index == nums.length) return;

        if (nums[index] <= target) {
            subset.add(nums[index]);
            generateSubsets(nums, set, subset, index, target - nums[index]); // reuse same element
            subset.remove(subset.size() - 1); // backtrack
        }
        generateSubsets(nums, set, subset, index + 1, target); // skip element
    }

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> set = new ArrayList<>();
        generateSubsets(nums, set, new ArrayList<>(), 0, target);
        return set;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(nums, target);
        System.out.println("Combinations that sum up to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
