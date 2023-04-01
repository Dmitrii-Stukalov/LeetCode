package code;

public class Solution374 extends GuessGame {
	public int guessNumber(int n) {
		int l = 1;
		int r = n;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (guess(m) == -1) {
				r = m;
			} else if (guess(m) == 1) {
				l = m + 1;
			} else {
				return m;
			}
		}
		return r;
	}
}

class GuessGame {
	private int picked = -1;

	public void setPicked(int pick) {
		picked = pick;
	}

	int guess(int num) {
		if (num > picked) {
			return -1;
		}
		return num < picked ? 1 : 0;
	}
}