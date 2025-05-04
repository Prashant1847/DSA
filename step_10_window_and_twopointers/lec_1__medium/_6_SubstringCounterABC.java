package step_10_window_and_twopointers.lec_1__medium;

public class _6_SubstringCounterABC {

    private static int helper(String s, int k) {
        int l = 0, r = 0, distinct = 0, count = 0;
        int n = s.length();
        int hash[] = {0, 0, 0};

        while (r < n) {
            char ch = s.charAt(r);

            if (hash[ch - 'a'] == 0) distinct++;
            hash[ch - 'a']++;

            while (distinct > k) {
                char toRemove = s.charAt(l);
                hash[toRemove - 'a']--;
                if (hash[toRemove - 'a'] == 0) distinct--;
                l++;
            }

            count += r - l + 1;
            r++;
        }
        return count;
    }

    public static int numberOfSubstrings(String s) {
        return (helper(s, 3) - helper(s, 2));
    }

    public static void main(String[] args) {
        String s = "abcabc";
        int result = numberOfSubstrings(s);
        System.out.println("Number of substrings containing all three characters 'a', 'b', and 'c': " + result);
    }
}
