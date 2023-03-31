package code;

public class Solution1444 {
	public int ways(String[] pizza, int k) {
		int m = pizza.length;
		int n = pizza[0].length();
		Integer[][][] dp = new Integer[k][m][n];
		int[][] preSum = new int[m + 1][n + 1];

		for (int i = m - 1; i > -1; i--) {
			for (int j = n - 1; j > -1; j--) {
				preSum[i][j] = preSum[i][j + 1] + preSum[i + 1][j] - preSum[i + 1][j + 1] + (pizza[i].charAt(j) == 'A' ? 1 : 0);
			}
		}

		return dfs(m, n, k - 1, 0, 0, dp, preSum);
	}

	private int dfs(int m, int n, int k, int r, int c, Integer[][][] dp, int[][] preSum) {
		if (preSum[r][c] == 0) {
			return 0;
		}
		if (k == 0) {
			return 1;
		}
		if (dp[k][r][c] != null) {
			return dp[k][r][c];
		}
		int ans = 0;

		for (int i = r + 1; i < m; i++) {
			if (preSum[r][c] - preSum[i][c] > 0) {
				ans = (ans + dfs(m, n, k - 1, i, c, dp, preSum)) % 1_000_000_007;
			}
		}
		for (int i = c + 1; i < n; i++) {
			if (preSum[r][c] - preSum[r][i] > 0) {
				ans = (ans + dfs(m, n, k - 1, r, i, dp, preSum)) % 1_000_000_007;
			}
		}

		return dp[k][r][c] = ans;
	}
}
