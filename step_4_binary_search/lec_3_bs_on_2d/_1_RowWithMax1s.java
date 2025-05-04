package step_4_binary_search.lec_3_bs_on_2d;


public class _1_RowWithMax1s {

    private static int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
                high = mid - 1;
            } else low = mid + 1;
        }

        return arr.length - low;
    }

    public static int rowWithMax1s(int[][] arr) {
        int maxOnes = -1, index = -1;

        for (int i = 0; i < arr.length; i++) {
            int ones = countOnes(arr[i]);
            if (ones > maxOnes) {
                maxOnes = ones;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(matrix);
        System.out.println("Row with maximum 1s: " + result);
    }
}
