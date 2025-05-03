package step_3__problems_on_arrays.lec_3_hard;
import java.util.ArrayList;
import java.util.List;

public class _2_MajorityElement {

    public static List<Integer> majorityElement(int[] nums) {
        int num1 = 0, num2 = 0;
        int count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i]) count1++;
            else if (num2 == nums[i]) count2++;
            else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) count1++;
            else if (nums[i] == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) result.add(num1);
        if (count2 > nums.length / 3) result.add(num2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};  // Sample input
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority elements (appearing more than n/3 times): " + result);
    }
}

