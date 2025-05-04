package step_5__strings.lec_2__medium;

public class _3_MyAtoi {

    public static int myAtoi(String s) {
        int i = 0;
        double result = 0;
        int n = s.length();
        char sign = '+';

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i);
            i++;
        }

        // Skip leading zeroes
        while (i < n && s.charAt(i) == '0') i++;

        // Convert digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            result *= 10;
            result += (s.charAt(i) - '0');
            i++;
        }

        result = (sign == '-') ? -result : result;

        if (result > Integer.MAX_VALUE) result = Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE) result = Integer.MIN_VALUE;

        return (int) result;
    }

    public static void main(String[] args) {
        String input = "   -0042";
        int result = myAtoi(input);
        System.out.println("Converted integer: " + result);
    }
}
