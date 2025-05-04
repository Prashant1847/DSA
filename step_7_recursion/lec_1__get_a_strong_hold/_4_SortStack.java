package step_7_recursion.lec_1__get_a_strong_hold;

import java.util.Stack;

public class _4_SortStack {

    private static void swapper(Stack<Integer> s) {
        if (s.size() == 1) return;

        int current = s.pop();
        swapper(s);

        int compare = s.peek();

        if (current < compare) {
            s.pop();
            s.push(current);
            s.push(compare);
            return;
        }

        s.push(current);
    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            swapper(s);
        }
        return s;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        Stack<Integer> sorted = sort(stack);
        System.out.println("Sorted Stack: " + sorted);
    }
}
