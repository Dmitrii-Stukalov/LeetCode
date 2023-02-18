package test;

import code.Solution2568;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2568Test {
	Solution2568 solution = new Solution2568();

	@Test
	void firstTest() {
		int[] nums = {2, 1};
		assertEquals(4, solution.minImpossibleOR(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {5, 3, 2};
		assertEquals(1, solution.minImpossibleOR(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = {1, 25, 2, 72};
		assertEquals(4, solution.minImpossibleOR(nums));
	}

	@Test
	void fourthTest() {
		int[] nums = {4, 32, 16, 8, 8, 75, 1, 2};
		assertEquals(64, solution.minImpossibleOR(nums));
	}
}