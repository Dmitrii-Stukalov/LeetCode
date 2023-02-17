package test;

import code.Solution2535;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2535Test {
	Solution2535 solution = new Solution2535();

	@Test
	void firstTest() {
		int[] nums = {1, 15, 6, 3};
		assertEquals(9, solution.differenceOfSum(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1, 2, 3, 4};
		assertEquals(0, solution.differenceOfSum(nums));
	}
}