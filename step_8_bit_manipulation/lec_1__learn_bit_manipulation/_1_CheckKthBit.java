package step_8_bit_manipulation.lec_1__learn_bit_manipulation;

public class _1_CheckKthBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        int checker = 1;
        checker = checker << k;
        int result = n & checker;

        return result == checker;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int k = 2;

        boolean isSet = checkKthBit(n, k);
        System.out.println("Is the " + k + "th bit set in " + n + "? " + isSet);
    }
}

