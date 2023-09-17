package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution2707 {
    public int minExtraChar(String s, String[] dictionary) {
        int max = s.length() + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;

        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));

        for (int i = 1; i < max; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 1; j <= i; j++) {
                if (dict.contains(s.substring(i - j, i))) {
                    dp[i] = Math.min(dp[i], dp[i - j]);
                }
            }
        }
        return dp[s.length()];
    }
}
