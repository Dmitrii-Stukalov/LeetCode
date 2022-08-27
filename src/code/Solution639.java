package code;

public class Solution639 {
	public int numDecodings(String s) {
		int n = s.length();
		if (n == 0 || s.charAt(0) == '0') return 0;

		long[] dp = new long[n + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '*' ? 9 : 1;

		int modulo = 1_000_000_007;

		for (int i = 2; i < n + 1; ++i) {
			char first = s.charAt(i - 2);
			char second = s.charAt(i - 1);

			if (second == '*') {
				dp[i] += 9 * dp[i - 1];
			} else if (second != '0') {
				dp[i] = dp[i - 1];
			}

			if (first == '*') {
				if (second == '*') {
					dp[i] += 15 * dp[i - 2];
				} else if (second <= '6') {
					dp[i] += 2 * dp[i - 2];
				} else {
					dp[i] += dp[i - 2];
				}

			} else if (first == '1') {
				if (second == '*') {
					dp[i] += 9 * dp[i - 2];
				} else {
					dp[i] += dp[i - 2];
				}
			} else if (first == '2') {
				if (second == '*') {
					dp[i] += 6 * dp[i - 2];
				} else if (second <= '6') {
					dp[i] += dp[i - 2];
				}
			}
			dp[i] %= modulo;
		}
		return (int) (dp[n]);
	}
}