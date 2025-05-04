package step_10_window_and_twopointers.lec_1__medium;

import java.util.HashMap;
import java.util.Map;

public class _1_LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, n = s.length(), len = 0;

        while (right < n) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) left = Math.max(map.get(ch) + 1, left);

            map.put(ch, right);
            len = Math.max(len, right - left + 1);
            right++;
        }

        return len;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
