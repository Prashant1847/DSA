package step_7_recursion.lec_3_trying_all_combos;

import java.util.Arrays;
import java.util.List;

public class _5_WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakHelper(s, wordDict);
    }

    private static boolean wordBreakHelper(String s, List<String> wordDict) {
        // Base case: if the string is empty, it can be segmented
        if (s.isEmpty()) {
            return true;
        }

        // Try to split the string at every possible position
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            // Check if the prefix is in the dictionary
            if (wordDict.contains(prefix)) {
                // Recursively check the remaining part of the string
                if (wordBreakHelper(s.substring(i), wordDict)) {
                    return true;
                }
            }
        }

        // If no valid segmentation is found, return false
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean result = wordBreak(s, wordDict);
        System.out.println("Can \"" + s + "\" be segmented? " + result);
    }
}
