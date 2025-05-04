package step_8_bit_manipulation.lec_2_interview_problems;

public class _2_SingleNumberFinder {

    public static int singleNumber(int[] nums) {
        int singleNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            singleNumber = singleNumber ^ nums[i];
        }
        return singleNumber;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};

        int result = singleNumber(nums);
        System.out.println("The number that appears only once is: " + result);
    }
}
