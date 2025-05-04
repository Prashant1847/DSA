package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.List;

public class _3_Subsets {

    private static void helper(int index, int[] arr, List<Integer> subset, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[index]);
        helper(index + 1, arr, subset, result);

        subset.remove(subset.size() - 1);
        helper(index + 1, arr, subset, result);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = subsets(nums);

        System.out.println("All subsets of the array:");
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}

