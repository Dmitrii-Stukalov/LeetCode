package code;

import java.util.HashSet;
import java.util.Set;

public class Solution1763 {
    public String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) {
                continue;
            }
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i + 1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s;
    }
}
