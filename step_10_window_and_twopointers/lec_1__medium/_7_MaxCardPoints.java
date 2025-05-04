package step_10_window_and_twopointers.lec_1__medium;

public class _7_MaxCardPoints {

    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int maxSum = 0;

        // calculate left sum 
        for (int i = 0; i < k; i++) sum += cardPoints[i];
        maxSum = sum;

        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - i - 1];
            sum += cardPoints[cardPoints.length - 1 - i];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int result = maxScore(cardPoints, k);
        System.out.println("Maximum score from " + k + " cards: " + result);
    }
}
