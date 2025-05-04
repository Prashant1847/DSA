package step_8_bit_manipulation.lec_2_interview_problems;

import java.util.ArrayList;
import java.util.List;

public class _3_BitmaskSubsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;

        for (int i = 0; i < subsets; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) list.add(nums[j]);
            }

            answer.add(list);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

