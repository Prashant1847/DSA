package step_1__learn_the_basics.lec_4__know_basic_maths;

public class CheckPalindrome_3 {

    
    static int reverseDigit(int number){
        int temp = number;
        int reversedNumber = 0;

        while(temp != 0){
            int remainder = temp % 10;
            reversedNumber = (reversedNumber *  10) + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of "+number+ " is "+reversedNumber);
        return reversedNumber;
    }  


    static void checkPalindrome(int number){
        int reversedDigit = reverseDigit(number);
        if(reversedDigit== number) System.out.println("Number is palindrome");
        else System.out.println("Number is not a palindrome");
    }

    public static void main(String[] args) {
        CheckPalindrome_3.checkPalindrome(123);
        CheckPalindrome_3.checkPalindrome(121);
    }
}
