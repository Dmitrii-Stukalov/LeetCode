package code;


import java.util.Set;

public class Solution1704 {
    public boolean halvesAreAlike(String s) {
        int n = s.length() / 2;
        int counter = 0;
        char[] chars = s.toLowerCase().toCharArray();
        Set<Character> vowels = Set.of('e', 'a', 'o', 'u', 'i');
        for (int i = 0; i < n; i++) {
            if (vowels.contains(chars[i])) {
                counter++;
            }
            if (vowels.contains(chars[n + i])) {
                counter--;
            }
        }
        return counter == 0;
    }
}
