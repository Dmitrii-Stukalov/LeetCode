package code;

import java.util.Arrays;
import java.util.List;

public class Solution120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int size = triangle.size();
		int[][] dp = new int[size][size];
		dp[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < size; i++) {
			List<Integer> row = triangle.get(i);
			dp[i][0] = row.get(0) + dp[i - 1][0];
			for (int j = 1; j < row.size() - 1; j++) {
				dp[i][j] = row.get(j) + Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
			}
			dp[i][row.size() - 1] = row.get(row.size() - 1) + dp[i - 1][row.size() - 2];
		}
		return Arrays.stream(dp[size - 1]).min().getAsInt();
	}
}
