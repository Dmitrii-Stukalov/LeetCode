package code;

public class Solution1539 {
	public int findKthPositive(int[] arr, int k) {
		int l = 0;
		int r = arr.length;
		while (l < r) {
			int m = l + (r - l) / 2;
			int missed = arr[m] - m - 1;
			if (missed >= k) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		return l + k;
	}
}
