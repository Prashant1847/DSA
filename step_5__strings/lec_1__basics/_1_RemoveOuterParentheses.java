package step_5__strings.lec_1__basics;

public class _1_RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (balance > 0) result.append(s.charAt(i));
                balance++;
            } else {
                balance--;
                if (balance > 0) result.append(s.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String output = removeOuterParentheses(input);
        System.out.println("After removing outer parentheses: " + output);
    }
}
