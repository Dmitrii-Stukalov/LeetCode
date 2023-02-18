package test;

import code.Solution1720;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1720Test {
	Solution1720 solution = new Solution1720();

	@Test
	void firstTest() {
		int[] encoded = {1, 2, 3};
		int first = 1;
		assertArrayEquals(new int[]{1, 0, 2, 1}, solution.decode(encoded, first));
	}

	@Test
	void secondTest() {
		int[] encoded = {6, 2, 7, 3};
		int first = 4;
		assertArrayEquals(new int[]{4, 2, 0, 7, 4}, solution.decode(encoded, first));
	}
}