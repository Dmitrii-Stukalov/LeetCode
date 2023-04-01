package test;

import code.Solution53;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution53Test {
	Solution53 solution = new Solution53();

	@Test
	void firstTest() {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		assertEquals(6, solution.maxSubArray(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1};
		assertEquals(1, solution.maxSubArray(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = {5, 4, -1, 7, 8};
		assertEquals(23, solution.maxSubArray(nums));
	}
}