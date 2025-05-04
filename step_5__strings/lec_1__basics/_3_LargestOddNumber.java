package step_5__strings.lec_1__basics;

public class _3_LargestOddNumber {

    public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String input = "35427046";
        String result = largestOddNumber(input);
        System.out.println("Largest odd number from left prefix: " + result);
    }
}
