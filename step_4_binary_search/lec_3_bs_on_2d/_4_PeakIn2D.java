package step_4_binary_search.lec_3_bs_on_2d;


import java.util.Arrays;

public class _4_PeakIn2D {

    public static int[] findPeakGrid(int[][] arr) {
        int r = arr.length, c = arr[0].length;
        int low = 0, high = c - 1;
        int result[] = { -1, -1 };

        while (low <= high) {
            int j = (low + high) / 2;
            int i = 0;

            for (int k = 1; k < r; k++) {
                if (arr[k][j] > arr[i][j])
                    i = k;
            }

            int left = j - 1 >= 0 ? arr[i][j - 1] : -1;
            int right = j + 1 < c ? arr[i][j + 1] : -1;

            if (arr[i][j] > left && arr[i][j] > right) {
                result[0] = i;
                result[1] = j;
                return result;
            } else if (left > arr[i][j]) high = j - 1;
            else low = j + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 8, 10, 10},
            {14, 13, 12, 11},
            {15, 9, 11, 21},
            {16, 17, 19, 20}
        };

        int[] peak = findPeakGrid(matrix);
        System.out.println("Peak element found at position: " + Arrays.toString(peak));
    }
}
