package code;

import java.util.Arrays;

public class Solution1769 {
	public int[] minOperations(String boxes) {
		int n = boxes.length();
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (boxes.charAt(j) == '1') {
					result[i] += Math.abs(i - j);
				}
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
