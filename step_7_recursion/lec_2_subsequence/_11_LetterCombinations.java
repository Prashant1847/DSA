package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.List;

public class _11_LetterCombinations {

    private static void findCombinations(String[] mapping, List<String> ans, int index, String digits, String result) {
        if (index == digits.length()) {
            ans.add(result);
            return;
        }

        String mapped = mapping[digits.charAt(index) - '0'];

        for (int i = 0; i < mapped.length(); i++) {
            findCombinations(mapping, ans, index + 1, digits, result + mapped.charAt(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.equals("")) return ans;

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        findCombinations(mapping, ans, 0, digits, "");
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> combinations = letterCombinations(digits);

        System.out.println("Letter combinations for \"" + digits + "\":");
        for (String combo : combinations) {
            System.out.println(combo);
        }
    }
}
