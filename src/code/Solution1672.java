package code;

import java.util.Arrays;

public class Solution1672 {
	public int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int[] account : accounts) {
			int sum = Arrays.stream(account).sum();
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}
}
