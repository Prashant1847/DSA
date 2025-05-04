package step_8_bit_manipulation.lec_1__learn_bit_manipulation;

// User function Template for Java
public class _5_SetBitFinder {

    static int setBit(int n) {
        return (((n ^ (n + 1)) & (n + 1)) ^ n);
    }

    public static void main(String[] args) {
        int n = 12; // Example number
        int result = setBit(n);
        System.out.println("The number after setting the rightmost unset bit in " + n + " is: " + result);
    }
}
