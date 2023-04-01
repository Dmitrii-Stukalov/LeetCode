package test;

import code.Solution704;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution704Test {
	Solution704 solution = new Solution704();

	@Test
	void firstTest() {
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = 9;
		assertEquals(4, solution.search(nums, target));
	}

	@Test
	void secondTest() {
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = 2;
		assertEquals(-1, solution.search(nums, target));
	}
}