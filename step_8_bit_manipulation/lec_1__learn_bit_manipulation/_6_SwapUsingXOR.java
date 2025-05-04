package step_8_bit_manipulation.lec_1__learn_bit_manipulation;

import java.util.ArrayList;
import java.util.List;

public class _6_SwapUsingXOR {

    static List<Integer> get(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        return list;
    }

    public static void main(String[] args) {
        int a = 5, b = 9;

        List<Integer> swapped = get(a, b);
        System.out.println("After swapping:");
        System.out.println("a = " + swapped.get(0));
        System.out.println("b = " + swapped.get(1));
    }
}
