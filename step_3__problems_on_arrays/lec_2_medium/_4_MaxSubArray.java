package step_3__problems_on_arrays.lec_2_medium;

public class _4_MaxSubArray{

    public static int maxSubArray(int[] arr) {
        int sum = 0, largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            largest = Math.max(largest, sum);
            if(sum < 0) sum = 0;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] testArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};  // Sample test input
        int result = maxSubArray(testArray);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
