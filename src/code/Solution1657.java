package code;

import java.util.Arrays;

public class Solution1657 {
    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if (n != m) {
            return false;
        }

        int[] word1Count = new int[26];
        int[] word2Count = new int[26];
        for (int i = 0; i < n; i++) {
            word1Count[word1.charAt(i) - 'a']++;
            word2Count[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (word1Count[i] != 0 && word2Count[i] != 0 || word1Count[i] == 0 && word2Count[i] == 0) {
                continue;
            }
            return false;
        }
        Arrays.sort(word1Count);
        Arrays.sort(word2Count);

        for (int i = 0; i < 26; i++) {
            if (word1Count[i] != word2Count[i]) {
                return false;
            }
        }
        return true;
    }
}
