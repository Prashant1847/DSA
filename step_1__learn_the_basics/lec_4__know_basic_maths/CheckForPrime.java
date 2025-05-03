package step_1__learn_the_basics.lec_4__know_basic_maths;

public class CheckForPrime {

    // (53, 4) -->
    static void checkIf_prime(int number){
        int count = 0;
        for(int i=1; i*i <= number; i++){
            if(number%i == 0){
                count++;
                if(number / i != i) count ++;
            }
        }

        if(count == 2) System.out.println("number if prime buddy");
        else System.err.println("number is not a prime");
    }


    public static void main(String[] args) {
        CheckForPrime.checkIf_prime(50);
    }
    
}
