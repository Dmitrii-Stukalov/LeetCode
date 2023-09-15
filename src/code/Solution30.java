package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.merge(word, 1, Integer::sum);
        }

        List<Integer> indexes = new ArrayList<>();
        int n = s.length();
        int num = words.length;
        int wordLength = words[0].length();
        for (int i = 0; i < n - num * wordLength + 1; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                String word = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                if (!wordCount.containsKey(word)) {
                    break;
                }
                seen.merge(word, 1, Integer::sum);
                if (seen.get(word) > wordCount.get(word)) {
                    break;
                }
                j++;
            }
            if (j == num) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
