package step_5__strings.lec_2__medium;

public class _2_MaxDepth {

    public static int maxDepth(String s) {
        int maxDepth = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
                maxDepth = Math.max(count, maxDepth);
            } else if (ch == ')') {
                count--;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(input);
        System.out.println("Maximum nesting depth: " + result);
    }
}
