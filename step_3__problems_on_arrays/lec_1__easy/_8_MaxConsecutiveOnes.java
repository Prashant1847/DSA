public class _8_MaxConsecutiveOnes{

    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0, maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }

    public static void main(String[] args) {
        int[] testArray = {1, 1, 0, 1, 1, 1};  // Sample test input
        int result = findMaxConsecutiveOnes(testArray);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
}
