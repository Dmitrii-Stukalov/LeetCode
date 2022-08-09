package test;

import code.Solution300;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution300Test {
	Solution300 solution = new Solution300();

	@Test
	void firstTest() {
		int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
		assertEquals(4, solution.lengthOfLIS(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{0, 1, 0, 3, 2, 3};
		assertEquals(4, solution.lengthOfLIS(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};
		assertEquals(1, solution.lengthOfLIS(nums));
	}
}