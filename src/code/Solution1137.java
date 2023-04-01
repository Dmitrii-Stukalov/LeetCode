package code;

public class Solution1137 {
	public int tribonacci(int n) {
		if (n < 2) {
			return n;
		}
		if (n == 2) {
			return 1;
		}
		int[] tribs = new int[n + 1];
		tribs[0] = 0;
		tribs[1] = 1;
		tribs[2] = 1;
		for (int i = 3; i < n + 1; i++) {
			tribs[i] = tribs[i - 3] + tribs[i - 2] + tribs[i - 1];
		}
		return tribs[n];
	}
}
