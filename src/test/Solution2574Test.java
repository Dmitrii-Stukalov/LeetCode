package test;

import code.Solution2574;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2574Test {
	Solution2574 solution = new Solution2574();

	@Test
	void firstTest() {
		int[] nums = {10, 4, 8, 3};
		assertArrayEquals(new int[]{15, 1, 11, 22}, solution.leftRigthDifference(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1};
		assertArrayEquals(new int[]{0}, solution.leftRigthDifference(nums));
	}
}