package step_1__learn_the_basics.lec_4__know_basic_maths;

public class Armstrong_5{

    static int countDigits(int number){
        return  (int)(Math.log10(number) + 1);
    }

    static void check_armstrongNumber(int number){
        int temp = number;
        int totalDigits = countDigits(temp);
        int newSum = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            newSum += Math.pow(remainder, totalDigits);
            temp /= 10;
        }

        if(newSum == number) System.out.println(number + " is an armstrong number");
        else System.out.println(number+ " is not an armstrong number");
    }
    

    public static void main(String[] args) {
        Armstrong_5.check_armstrongNumber(153);
    }

}