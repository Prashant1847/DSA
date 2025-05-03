package step_1__learn_the_basics.lec_4__know_basic_maths;

public class ReverseANumber_2 {

    static int reverseDigit(int number) {
        int temp = number;
        int reversedNumber = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reversedNumber);
        return reversedNumber;
    }

    public static void main(String[] args) {
        ReverseANumber_2.reverseDigit(1234);
        ReverseANumber_2.reverseDigit(10400);

    }
}
