package test;

import code.Solution2567;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2567Test {
	Solution2567 solution = new Solution2567();

	@Test
	void firstTest() {
		int[] nums = {1, 4, 3};
		assertEquals(0, solution.minimizeSum(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1, 4, 7, 8, 5};
		assertEquals(3, solution.minimizeSum(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = {59, 27, 9, 81, 33};
		assertEquals(24, solution.minimizeSum(nums));
	}

	@Test
	void fourthTest() {
		int[] nums = {58, 42, 8, 75, 28};
		// 8, 28, 42, 58, 75
		// 14 + 67 = 81
		// 75, 75, 42, 58, 75
		// 0 + 33 -> 33
		// 8, 28, 41, 8, 8
		// 0 + 33 -> 33
		// 42, 28, 42, 58, 42
		// 0 + 30
		assertEquals(30, solution.minimizeSum(nums));
	}
}