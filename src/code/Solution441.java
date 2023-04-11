package code;

public class Solution441 {
	public int arrangeCoins(int n) {
		int l = 0;
		int r = n;
		while (l < r) {
			int m = l + (r - l) / 2;
			long sum = (long) m * (m + 1) / 2;
			if (sum == n) {
				return m;
			}
			if (sum > n) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		return n == 1 ? l : l - 1;
	}
}
