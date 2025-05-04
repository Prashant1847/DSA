package step_4_binary_search.lec_2_bs_on_answers;

public class _7_FindKthPositive {

    public static int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int missingNumbersCount = arr[mid] - (mid + 1);
            if (missingNumbersCount < k) {
                low = mid + 1;
            } else high = mid - 1;
        }

        return k + high + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}

