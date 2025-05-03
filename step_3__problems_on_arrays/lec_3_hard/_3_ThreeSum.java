package step_3__problems_on_arrays.lec_3_hard;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_ThreeSum {

    public static List<List<Integer>> threeSum(int[] arr) {
        int n = arr.length;
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum < 0) j++;
                else if (sum > 0) k--;
                else {
                    triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                    while (j < k && arr[j] == arr[j - 1]) j--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};  // Sample input
        List<List<Integer>> result = threeSum(nums);
        System.out.println("Triplets that sum to zero: " + result);
    }
}

