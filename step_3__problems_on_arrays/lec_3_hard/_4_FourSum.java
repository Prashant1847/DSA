package step_3__problems_on_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_FourSum{

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                if (j - 1 != i && arr[j] == arr[j - 1]) continue;

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum < target) k++;
                    else if (sum > target) l--;
                    else {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[l] == arr[l + 1]) l--;
                        while (k < l && arr[k] == arr[k - 1]) k++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println("Quadruplets that sum to " + target + ": " + result);
    }
}
