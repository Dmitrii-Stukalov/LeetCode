package code;

public class Solution1221 {
	public int balancedStringSplit(String s) {
		int cnt = s.charAt(0) == 'R' ? 1 : -1;
		int ans = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				cnt++;
			} else {
				cnt--;
			}
			if (cnt == 0) {
				ans++;
			}
		}
		return ans;
	}
}
