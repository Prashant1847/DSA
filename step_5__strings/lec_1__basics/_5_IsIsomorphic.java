package step_5__strings.lec_1__basics;

import java.util.HashMap;
import java.util.Map;

public class _5_IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!map.containsKey(original)) {
                if (!map.containsValue(replacement)) {
                    map.put(original, replacement);
                } else return false;
            } else {
                char mappedChar = map.get(original);
                if (mappedChar != replacement) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println("Are \"" + s + "\" and \"" + t + "\" isomorphic? " + result);
    }
}
