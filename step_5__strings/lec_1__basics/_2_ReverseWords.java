package step_5__strings.lec_1__basics;

public class _2_ReverseWords {

    public static String reverseWords(String s) {
        String reversed = "";
        String word = "";

        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word = ch + word;
            } else {
                if (i < n - 1 && s.charAt(i + 1) != ' ') {
                    reversed += (word + " ");
                    word = "";
                }
            }
        }
        reversed += word;
        if (reversed.charAt(reversed.length() - 1) == ' ') 
            reversed = reversed.substring(0, reversed.length() - 1);
        
        return reversed;
    }

    public static void main(String[] args) {
        String input = "  hello   world  ";
        String output = reverseWords(input);
        System.out.println("Reversed words: \"" + output + "\"");
    }
}
