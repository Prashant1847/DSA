package step_7_recursion.lec_3_trying_all_combos;

import java.util.ArrayList;
import java.util.List;

public class _1_PalindromePartitioning {

    private static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void generate(List<List<String>> result, List<String> partition, String str, int index) {
        if (index == str.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }

        for (int i = index; i < str.length(); i++) {
            String toCheck = str.substring(index, i + 1);
            if (isPalindrome(toCheck)) {
                partition.add(toCheck);
                generate(result, partition, str, i + 1);
                partition.remove(partition.size() - 1); // backtrack
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        generate(result, new ArrayList<>(), s, 0);
        return result;
    }

    public static void main(String[] args) {
        String input = "aab";
        List<List<String>> partitions = partition(input);
        System.out.println("Palindrome partitions of \"" + input + "\":");
        for (List<String> partition : partitions) {
            System.out.println(partition);
        }
    }
}

