package step_4_binary_search.lec_2_bs_on_answers;

public class _1_SquareRoot {

    private static int floorSqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = mid * mid;
            if (val <= (n)) {
                //eliminate the left half:
                low = (mid + 1);
            } else {
                //eliminate the right half:
                high = (mid - 1);
            }
        }
        return high;
    }
    
    public static void main(String[] args) {
        System.out.println("Square root -->" +floorSqrt(16));
        System.out.println("Square root -->" +floorSqrt(15));
    }
}
