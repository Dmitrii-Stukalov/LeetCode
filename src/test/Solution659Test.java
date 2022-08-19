package test;

import code.Solution659;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution659Test {
	Solution659 solution = new Solution659();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 2, 3, 3, 4, 5};
		assertTrue(solution.isPossible(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{1, 2, 3, 3, 4, 4, 5, 5};
		assertTrue(solution.isPossible(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{1, 2, 3, 4, 4, 5};
		assertFalse(solution.isPossible(nums));
	}

}