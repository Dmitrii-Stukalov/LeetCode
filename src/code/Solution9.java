package code;

public class Solution9 {
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		int l = 0;
		int r = s.length() - 1;
		while (l < r && s.charAt(l) == s.charAt(r)) {
			l++;
			r--;
		}
		return l >= r;
	}
}
