package code;

public class Solution2433 {
	public int[] findArray(int[] pref) {
		int n = pref.length;
		int[] result = new int[n];
		int[] xors = new int[n];
		result[0] = pref[0];
		xors[0] = pref[0];
		for (int i = 1; i < n; i++) {
			result[i] = xors[i - 1] ^ pref[i];
			xors[i] = xors[i - 1] ^ result[i];
		}
		return result;
	}
}
