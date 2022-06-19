package code;

public class Solution392 {
	public boolean isSubsequence(String s, String t) {
		int sPointer = 0;
		for (int i = 0; i < t.length(); i++) {
			if (sPointer == s.length()) {
				return true;
			}
			if (t.charAt(i) == s.charAt(sPointer)) {
				sPointer++;
			}
		}
		return sPointer == s.length();
	}
}
