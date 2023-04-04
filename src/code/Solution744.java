package code;

public class Solution744 {
	public char nextGreatestLetter(char[] letters, char target) {
		int l = 0;
		int r = letters.length - 1;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (target >= letters[m]) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		return letters[r] > target ? letters[r] : letters[0];
	}
}
