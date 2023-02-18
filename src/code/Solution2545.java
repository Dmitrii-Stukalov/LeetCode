package code;

import java.util.Arrays;

public class Solution2545 {
	public int[][] sortTheStudents(int[][] score, int k) {
		Arrays.sort(score, (a, b) -> Integer.compare(b[k], a[k]));
		return score;
	}
}
