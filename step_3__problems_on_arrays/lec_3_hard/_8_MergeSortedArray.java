package step_3__problems_on_arrays.lec_3_hard;

import java.util.Arrays;

public class _8_MergeSortedArray {

    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int right = arr1.length - 1;

        int i = m - 1, j = n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] >= arr2[j]) {
                arr1[right--] = arr1[i--];
            } else {
                arr1[right--] = arr2[j--];
            }
        }

        while (i >= 0) {
            arr1[right--] = arr1[i--];
        }

        while (j >= 0) {
            arr1[right--] = arr2[j--];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};  // size m+n
        int m = 3;
        int[] arr2 = {2, 5, 6};
        int n = 3;

        merge(arr1, m, arr2, n);

        System.out.println("Merged array: " + Arrays.toString(arr1));
    }
}
