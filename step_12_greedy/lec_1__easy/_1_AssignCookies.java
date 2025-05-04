package step_12_greedy.lec_1__easy;

import java.util.Arrays;

public class _1_AssignCookies {

    public static int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int i = 0, j = 0, count = 0;

        while (i < children.length && j < cookies.length) {
            if (children[i] <= cookies[j]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] children = {1, 2, 3};
        int[] cookies = {1, 1};

        int result = findContentChildren(children, cookies);
        System.out.println("Maximum number of content children: " + result);
    }
}
