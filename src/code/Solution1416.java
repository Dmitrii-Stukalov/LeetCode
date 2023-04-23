package code;

import java.util.Arrays;

public class Solution1416 {
    public int numberOfArrays(String s, int k) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return dfs(s, k, 0, dp);
    }

    int dfs(String s, long k, int i, int[] dp) {
        if (i == s.length()) {
            return 1;
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int ans = 0;
        long num = 0;
        for (int j = i; j < s.length(); j++) {
            num = num * 10 + s.charAt(j) - '0';
            if (num > k) {
                break;
            }
            ans += dfs(s, k, j + 1, dp);
            ans %= 1_000_000_007;
        }
        return dp[i] = ans;
    }
}
