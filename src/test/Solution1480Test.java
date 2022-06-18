package test;

import org.junit.jupiter.api.Test;

import code.Solution1480;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1480Test {

	Solution1480 solution = new Solution1480();

	@Test
	void firstTest() {
		int[] array = {1, 2, 3, 4};
		assertArrayEquals(new int[]{1, 3, 6, 10}, solution.runningSum(array));
	}

	@Test
	void secondTest() {
		int[] array = {1, 1, 1, 1, 1};
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.runningSum(array));
	}

	@Test
	void thirdTest() {
		int[] array = {3, 1, 2, 10, 1};
		assertArrayEquals(new int[]{3, 4, 6, 16, 17}, solution.runningSum(array));
	}
}