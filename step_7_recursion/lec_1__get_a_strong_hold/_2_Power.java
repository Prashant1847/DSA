package step_7_recursion.lec_1__get_a_strong_hold;

public class _2_Power {

    private static double power(double x, long e, double ans) {
        if (e == 0) return ans;
        if ((e & 1) == 1) return power(x, e - 1, ans * x);
        else return power(x * x, e / 2, ans);
    }

    public static double myPow(double x, int n) {
        long nn = n;
        nn = nn < 0 ? -nn : n;
        double result = power(x, nn, 1);
        return (n < 0) ? 1.0 / result : result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -3;

        double result = myPow(x, n);
        System.out.println(x + " raised to the power " + n + " is: " + result);
    }
}
