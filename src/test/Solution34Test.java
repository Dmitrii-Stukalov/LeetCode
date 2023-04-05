package test;

import code.Solution34;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution34Test {
	Solution34 solution = new Solution34();

	@Test
	void firstTest() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 8;
		assertArrayEquals(new int[]{3, 4}, solution.searchRange(nums, target));
	}

	@Test
	void secondTest() {
		int[] nums = {5, 7, 7, 8, 8, 10};
		int target = 6;
		assertArrayEquals(new int[]{-1, -1}, solution.searchRange(nums, target));
	}

	@Test
	void thirdTest() {
		int[] nums = {};
		int target = 0;
		assertArrayEquals(new int[]{-1, -1}, solution.searchRange(nums, target));
	}

	@Test
	void additionalTest() {
		int[] nums = {1};
		int target = 1;
		assertArrayEquals(new int[]{0, 0}, solution.searchRange(nums, target));
	}
}