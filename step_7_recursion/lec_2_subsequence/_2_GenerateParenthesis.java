package step_7_recursion.lec_2_subsequence;

import java.util.ArrayList;
import java.util.List;

public class _2_GenerateParenthesis {

    private static void generate(List<String> result, char[] ch, int i, int bracketLeft, int balanced) {
        if (i == ch.length) {
            result.add(String.valueOf(ch));
            return;
        }

        if (bracketLeft > 0) {
            ch[i] = '(';
            generate(result, ch, i + 1, bracketLeft - 1, balanced + 1);

            if (balanced > 0) {
                ch[i] = ')';
                generate(result, ch, i + 1, bracketLeft, balanced - 1);
            }
        } else {
            ch[i] = ')';
            generate(result, ch, i + 1, bracketLeft, balanced - 1);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] ch = new char[2 * n];
        generate(result, ch, 0, n, 0);
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> parentheses = generateParenthesis(n);
        System.out.println("All valid combinations of " + n + " pairs of parentheses:");
        for (String str : parentheses) {
            System.out.println(str);
        }
    }
}
