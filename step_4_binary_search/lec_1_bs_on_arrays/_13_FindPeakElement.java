package step_4_binary_search.lec_1_bs_on_arrays;

public class _13_FindPeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] > arr[mid - 1]) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};  // Sample input
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);
    }
}

