package step_8_bit_manipulation.lec_2_interview_problems;

public class _5_TwoOddNumberFinder {

    public static int[] twoOddNum(int arr[], int N) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) xor = xor ^ arr[i];

        int firstDifBit = ((xor ^ (xor - 1)) & xor);
        int bucket1 = 0, bucket2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & firstDifBit) != 0) bucket1 = bucket1 ^ arr[i];
            else bucket2 = bucket2 ^ arr[i];
        }

        int result[] = new int[2];
        result[0] = bucket1 > bucket2 ? bucket1 : bucket2;
        result[1] = bucket1 < bucket2 ? bucket1 : bucket2;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 3, 1};
        int[] result = twoOddNum(arr, arr.length);

        System.out.println("Two odd occurring numbers are: " + result[0] + " and " + result[1]);
    }
}
