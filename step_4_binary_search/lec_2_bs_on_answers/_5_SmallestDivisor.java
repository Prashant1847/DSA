package step_4_binary_search.lec_2_bs_on_answers;

public class _5_SmallestDivisor {

    private static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    private static int divideAll(int[] arr, int divisor) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / (double) divisor);
        }
        return sum;
    }

    public static int smallestDivisor(int[] arr, int threshold) {
        int low = 1;
        int high = maxElement(arr);

        if (threshold == arr.length) return high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = divideAll(arr, mid);
            if (sum <= threshold) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9};
        int threshold = 6;
        int result = smallestDivisor(arr, threshold);
        System.out.println("Smallest divisor such that the sum is <= threshold: " + result);
    }
}
