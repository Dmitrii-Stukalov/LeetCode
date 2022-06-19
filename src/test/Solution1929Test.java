package test;

import code.Solution1929;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1929Test {
	Solution1929 solution = new Solution1929();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 2, 1};
		assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, solution.getConcatenation(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{1, 3, 2, 1};
		assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, solution.getConcatenation(nums));
	}

}