package step_8_bit_manipulation.lec_2_interview_problems;

public class _4_RangeXORCalculator {

    public static int xor_UptoN(int n) {
        if (n < 0) return 0;

        if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else if (n % 4 == 3) return 0;
        else return n;
    }

    public static int findXOR(int l, int r) {
        return xor_UptoN(l - 1) ^ xor_UptoN(r);
    }

    public static void main(String[] args) {
        int l = 3, r = 9;
        int result = findXOR(l, r);
        System.out.println("XOR of numbers from " + l + " to " + r + " is: " + result);
    }
}
