package step_10_window_and_twopointers.lec_1__medium;

public class _3_CharacterReplacementSolver {

    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0, n = s.length();
        int len = 0, maxFreq = 0;
        int hash[] = new int[26];

        while (right < n) {
            char ch = s.charAt(right);
            hash[ch - 'A']++;
            maxFreq = Math.max(maxFreq, hash[ch - 'A']);

            if (((right - left + 1) - maxFreq) > k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }

            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);
        System.out.println("Length of the longest substring after at most " + k + " replacements: " + result);
    }
}
