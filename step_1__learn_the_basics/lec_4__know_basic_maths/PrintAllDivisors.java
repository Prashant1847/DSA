package step_1__learn_the_basics.lec_4__know_basic_maths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {

    
    static void all_divisors(int number) {
        List<Integer> list = new ArrayList<>();

        // using i * i in place ot i<= Math.sqrt(number)
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
                if (number / i != i) {
                    list.add(number / i);
                }
            }
        } // for loop has o(squareroot(n))

        // this has o(number of factors * log(num of factors))
        list.sort((a, b) -> a - b);

        // O(number of factos)
        System.out.println(list);

        // add all complexity
    }


    public static void main(String[] args) {
        PrintAllDivisors.all_divisors(50);
    }
}
