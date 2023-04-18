package code;

public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder builder = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                builder.append(word2.charAt(j++));
            }
        }
        return builder.toString();
    }
}
