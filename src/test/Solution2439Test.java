package test;

import code.Solution2439;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution2439Test {
	Solution2439 solution = new Solution2439();

	@Test
	void firstTest() {
		int[] nums = {3, 7, 1, 6};
		assertEquals(5, solution.minimizeArrayValue(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {10, 1};
		assertEquals(10, solution.minimizeArrayValue(nums));
	}
}