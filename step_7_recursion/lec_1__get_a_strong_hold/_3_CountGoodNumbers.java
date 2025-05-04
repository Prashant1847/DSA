package step_7_recursion.lec_1__get_a_strong_hold;

public class _3_CountGoodNumbers {

    static long M = 1_000_000_007;

    public static long power(long base, long e, long ans) {
        if (e == 0) return ans;
        if ((e & 1) == 1) return power(base, e - 1, (ans * base) % M);
        else return power((base * base) % M, e / 2, ans);
    }

    public static int countGoodNumbers(long n) {
        long temp = power(20, n / 2, 1);
        return (n & 1) == 1 ? (int)((temp * 5) % M) : (int)temp;
    }

    public static void main(String[] args) {
        long n = 50;
        int result = countGoodNumbers(n);
        System.out.println("Count of good numbers for n = " + n + " is: " + result);
    }
}
