package test;

import code.Solution217;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Solution217Test {
	Solution217 solution = new Solution217();

	@Test
	void firstTest() {
		int[] nums = {1, 2, 3, 1};
		assertTrue(solution.containsDuplicate(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1, 2, 3, 4};
		assertFalse(solution.containsDuplicate(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		assertTrue(solution.containsDuplicate(nums));
	}
}