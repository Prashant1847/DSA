package step_1__learn_the_basics.lec_4__know_basic_maths;

public class FindGCD_4 {

    static void find_greatestCommonDivisor(int a, int b){
        while(a> 0 && b > 0){
            if(a > b) a %= b;
            else b %= a;
        }

        if(a==0) System.out.println("gcd is "+b);
        else System.out.println("gcd is "+a);
    }

    public static void main(String[] args) {
        FindGCD_4.find_greatestCommonDivisor(15, 10);
    }
    
}
