package step_5__strings.lec_1__basics;

public class _4_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        int i = 0;
        String result = "";

        while (i < arr[0].length()) {
            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {
                if (i < arr[j].length() && ch == arr[j].charAt(i)) continue;
                else return result;
            }
            result += ch;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String output = longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: \"" + output + "\"");
    }
}
