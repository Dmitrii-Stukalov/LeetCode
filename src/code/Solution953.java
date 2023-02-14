package code;

public class Solution953 {
    public boolean isAlienSorted(String[] words, String order) {
        int[] alphabet = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!compare(words[i], words[i + 1], alphabet)) {
                return false;
            }
        }
        return true;
    }

    boolean compare(String a, String b, int[] alphabet) {
        int i = 0;
        while (i < a.length() && i < b.length()) {
            if (a.charAt(i) == b.charAt(i)) {
                i++;
            } else {
                return alphabet[a.charAt(i) - 'a'] < alphabet[b.charAt(i) - 'a'];
            }
        }
        return a.length() <= b.length();
    }
}
