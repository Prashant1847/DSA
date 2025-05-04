package step_4_binary_search.lec_2_bs_on_answers;

public class _13_FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        if (n1 > n2) return findMedianSortedArrays(arr2, arr1);

        int low = 0, high = n1;
        int leftHalfCount = (n1 + n2 + 1) / 2;

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = leftHalfCount - mid1;

            int l1 = mid1 - 1 >= 0 ? arr1[mid1 - 1] : Integer.MIN_VALUE;
            int r1 = mid1 < n1 ? arr1[mid1] : Integer.MAX_VALUE;

            int l2 = mid2 - 1 >= 0 ? arr2[mid2 - 1] : Integer.MIN_VALUE;
            int r2 = mid2 < n2 ? arr2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return ((double) Math.max(l1, l2) + (double) Math.min(r1, r2)) / 2;
            } else if (l1 > r2)
                high = mid1 - 1;
            else
                low = mid1 + 1;
        }

        return -1.0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        double median = findMedianSortedArrays(arr1, arr2);
        System.out.println("Median of the two sorted arrays is: " + median);
    }
}
