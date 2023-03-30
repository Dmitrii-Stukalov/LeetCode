package test;

import code.Solution2433;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution2433Test {
	Solution2433 solution = new Solution2433();

	@Test
	void firstTest() {
		int[] pref = {5, 2, 0, 3, 1};
		assertArrayEquals(new int[]{5, 7, 2, 3, 2}, solution.findArray(pref));
	}

	@Test
	void secondTest() {
		int[] pref = {13};
		assertArrayEquals(new int[]{13}, solution.findArray(pref));
	}
}