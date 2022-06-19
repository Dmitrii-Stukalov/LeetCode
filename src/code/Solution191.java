package code;

public class Solution191 {
	public int hammingWeight(int n) {
		int nMutable = n;
		int ans = 0;
		while (nMutable != 0) {
			if (nMutable % 2 != 0) {
				ans += 1;
			}
			nMutable >>>= 1;
		}
		return ans;
	}
}
