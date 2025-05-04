package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.List;

public class _1_GenerateBinaryStrings {

    private static void helper(int n, int index, String str, List<String> result) {
        if (n == index) {
            result.add(str);
            return;
        }

        helper(n, index + 1, str + "0", result);

        if (index == 0 || str.charAt(index - 1) != '1') {
            helper(n, index + 1, str + "1", result);
        }
    }

    public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        helper(n, 0, "", result);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> binaryStrings = generateBinaryStrings(n);
        System.out.println("Binary strings of length " + n + " without consecutive 1s:");
        for (String str : binaryStrings) {
            System.out.println(str);
        }
    }
}
