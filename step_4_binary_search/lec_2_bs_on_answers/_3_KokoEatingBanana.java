package step_4_binary_search.lec_2_bs_on_answers;

public class _3_KokoEatingBanana {

    private static int hoursRequiredToEatKBananas(int[] piles, int kBanana) {
        int hoursTaken = 0;
        for (int i = 0; i < piles.length; i++) {
            hoursTaken += Math.ceil((double) piles[i] / kBanana);
        }
        return hoursTaken;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) if (piles[i] > high) high = piles[i];

        while (low <= high) {
            int kBanana = (low + high) / 2;
            int hoursTaken = hoursRequiredToEatKBananas(piles, kBanana);
            if (hoursTaken <= h) {
                high = kBanana - 1;
            } else low = kBanana + 1;
        }

        return low;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed to finish in " + h + " hours: " + result);
    }
}
