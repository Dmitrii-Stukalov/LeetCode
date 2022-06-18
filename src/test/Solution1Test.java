package test;

import code.Solution1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1Test {
	Solution1 solution = new Solution1();

	@Test
	void firstTest() {
		int[] array = {2, 7, 11, 15};
		int target = 9;
		assertArrayEquals(new int[]{0, 1}, solution.twoSum(array, target));
	}

	@Test
	void secondTest() {
		int[] array = {3, 2, 4};
		int target = 6;
		assertArrayEquals(new int[]{1, 2}, solution.twoSum(array, target));
	}

	@Test
	void thirdTest() {
		int[] array = {3, 3};
		int target = 6;
		assertArrayEquals(new int[]{0, 1}, solution.twoSum(array, target));
	}
}