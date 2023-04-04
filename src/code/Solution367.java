package code;

public class Solution367 {
	public boolean isPerfectSquare(int num) {
		int l = 1;
		int r = num / 2;
		while (l < r) {
			int m = l + (r - l) / 2;
			long product = (long) m * m;
			if (product == num) {
				return true;
			}
			if (product < num) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return l * l == num;
	}
}
