package step_7_recursion.lec_1__get_a_strong_hold;

import java.util.Stack;

public class _5_ReverseStack {

    private static void insertAtBottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, element);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverse(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
