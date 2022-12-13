package code;

import java.util.HashMap;
import java.util.Map;

public class Solution409 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        int ans = 0;
        for (int value : map.values()) {
            if (value % 2 == 0) {
                ans += value;
            } else if (value > 1) {
                ans += value - 1;
            }
        }
        return ans != s.length() ? ans + 1 : ans;
    }
}
