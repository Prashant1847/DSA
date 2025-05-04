package step_4_binary_search.lec_3_bs_on_2d;

public class _2_SearchIn2D {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int low = 0, high = matrix.length * col - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int rIndex = mid / col;
            int cIndex = mid % col;

            if (matrix[rIndex][cIndex] < target) {
                low = mid + 1;
            } else if (matrix[rIndex][cIndex] == target) return true;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found in matrix: " + found);
    }
}
