package step_8_bit_manipulation.lec_1__learn_bit_manipulation;

public class _2_OddEvenCheck {

    static String oddEven(int n) {
        return (n & 1) == 1 ? "odd" : "even";
    }

    public static void main(String[] args) {
        int number = 7;
        String result = oddEven(number);
        System.out.println("The number " + number + " is " + result + ".");
    }
}
