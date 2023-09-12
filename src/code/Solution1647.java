package code;

import java.util.HashSet;
import java.util.Set;

public class Solution1647 {
    public int minDeletions(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int cnt = 0;
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0 && !used.add(count[i])) {
                count[i]--;
                cnt++;
            }
        }
        return cnt;
    }
}
