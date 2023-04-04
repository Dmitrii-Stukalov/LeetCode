package code;

import java.util.Arrays;

public class Solution1385 {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2);
		int ans = 0;
		for (int num : arr1) {
			int l = 0;
			int r = arr2.length - 1;
			ans++;
			while (l <= r) {
				int m = l + (r - l) / 2;
				if (Math.abs(arr2[m] - num) <= d) {
					ans--;
					break;
				}
				if (arr2[m] > num) {
					r = m - 1;
				} else {
					l = m + 1;
				}
			}
		}
		return ans;
	}
}
