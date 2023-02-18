package test;

import code.Solution1389;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1389Test {
	Solution1389 solution = new Solution1389();

	@Test
	void firstTest() {
		int[] nums = {0, 1, 2, 3, 4};
		int[] index = {0, 1, 2, 2, 1};
		assertArrayEquals(new int[]{0, 4, 1, 3, 2}, solution.createTargetArray(nums, index));
	}

	@Test
	void secondTest() {
		int[] nums = {1, 2, 3, 4, 0};
		int[] index = {0, 1, 2, 3, 0};
		assertArrayEquals(new int[]{0, 1, 2, 3, 4}, solution.createTargetArray(nums, index));
	}
}