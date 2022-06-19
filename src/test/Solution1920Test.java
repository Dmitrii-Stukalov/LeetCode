package test;

import code.Solution1920;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1920Test {
	Solution1920 solution = new Solution1920();

	@Test
	void firstTest() {
		int[] nums = new int[]{0, 2, 1, 5, 3, 4};
		assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, solution.buildArray(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{5, 0, 1, 2, 3, 4};
		assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, solution.buildArray(nums));
	}
}