package step_8_bit_manipulation.lec_1__learn_bit_manipulation;

public class _3_PowerOfTwoCheck {

    public static boolean isPowerOfTwo(int n) {
        return (n > 0 && ((n & (n - 1)) == 0)) ? true : false;
    }

    public static void main(String[] args) {
        int number = 16;
        boolean result = isPowerOfTwo(number);
        System.out.println("Is " + number + " a power of two? " + result);
    }
}
