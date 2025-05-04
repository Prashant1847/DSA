package step_4_binary_search.lec_3_bs_on_2d;


public class _5_MatrixMedian {

    static int numberOfElements(int[] mat, int median) {
        int low = 0, high = mat.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mat[mid] <= median) low = mid + 1;
            else high = mid - 1;
        }

        return high + 1;
    }

    static int countElementUptoMedian(int[][] mat, int median) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count += numberOfElements(mat[i], median);
        }
        return count;
    }

    static int median(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        int elementsBefore = ((r * c) / 2) + 1;

        for (int i = 0; i < r; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][c - 1]);
        }

        while (low <= high) {
            int median = (low + high) / 2;

            int count = countElementUptoMedian(mat, median);

            if (count >= elementsBefore) high = median - 1;
            else low = median + 1;
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        int result = median(matrix);
        System.out.println("Median of the matrix is: " + result);
    }
}
