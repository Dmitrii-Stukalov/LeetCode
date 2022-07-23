package test;

import code.Solution1470;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1470Test {
	Solution1470 solution = new Solution1470();

	@Test
	void firstTest() {
		int[] nums = new int[]{2, 5, 1, 3, 4, 7};
		int n = 3;
		assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution.shuffle(nums, n));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
		int n = 4;
		assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, solution.shuffle(nums, n));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{1, 1, 2, 2};
		int n = 2;
		assertArrayEquals(new int[]{1, 2, 1, 2}, solution.shuffle(nums, n));
	}

}