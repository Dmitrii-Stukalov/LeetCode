package code;

import java.util.Arrays;

public class Solution2160 {
	public int minimumSum(int num) {
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100 % 10;
		int d = num / 1000;
		int[] digits = new int[]{a, b, c, d};
		Arrays.sort(digits);
		return digits[0] * 10 + digits[2] + digits[1] * 10 + digits[3];
	}
}
