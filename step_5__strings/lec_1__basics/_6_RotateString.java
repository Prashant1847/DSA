package step_5__strings.lec_1__basics;

public class _6_RotateString {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String appended = s + s;
        int mainLength = appended.length();
        int searchLength = goal.length();

        for (int i = 0; i <= mainLength - searchLength; i++) {
            int j;
            for (j = 0; j < searchLength; j++) {
                if (appended.charAt(i + j) != goal.charAt(j)) {
                    break;
                }
            }

            if (j == searchLength) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        boolean result = rotateString(s, goal);
        System.out.println("Is \"" + goal + "\" a rotation of \"" + s + "\"? " + result);
    }
}
