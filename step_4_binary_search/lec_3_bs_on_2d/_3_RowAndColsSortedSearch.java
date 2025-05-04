package step_4_binary_search.lec_3_bs_on_2d;

public class _3_RowAndColsSortedSearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
        while (c >= 0 && r < matrix.length) {
            if (target < matrix[r][c]) c--;
            else if (target > matrix[r][c]) r++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int target = 5;

        boolean found = searchMatrix(matrix, target);
        System.out.println("Target " + target + " found in matrix: " + found);
    }
}
