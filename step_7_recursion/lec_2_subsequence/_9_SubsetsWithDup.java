package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _9_SubsetsWithDup {

    private static void findCombinations(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds) {
        ans.add(new ArrayList<>(ds));

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue; // skip duplicates
            ds.add(arr[i]);
            findCombinations(i + 1, arr, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findCombinations(0, nums, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        List<List<Integer>> result = subsetsWithDup(nums);
        System.out.println("All unique subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
