package code;

public class Solution1220 {
	public int countVowelPermutation(int n) {
		int modulo = 1_000_000_007;

		long[][] dp = new long[n][5];
		for (int i = 0; i < 5; i++) {
			dp[0][i] = 1;
		}

		for (int i = 1; i < n; i++) {
			dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % modulo;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % modulo;
			dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % modulo;
			dp[i][3] = dp[i - 1][2];
			dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % modulo;
		}

		long ans = 0;
		for (int i = 0; i < 5; i++) {
			ans += dp[n - 1][i];
			ans %= modulo;
		}
		return (int) ans;
	}
}
