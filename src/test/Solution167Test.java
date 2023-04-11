package test;

import code.Solution167;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution167Test {
	Solution167 solution = new Solution167();

	@Test
	void firstTest() {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		assertArrayEquals(new int[]{1, 2}, solution.twoSum(numbers, target));
	}

	@Test
	void secondTest() {
		int[] numbers = {2, 3, 4};
		int target = 6;
		assertArrayEquals(new int[]{1, 3}, solution.twoSum(numbers, target));
	}

	@Test
	void thirdTest() {
		int[] numbers = {-1, 0};
		int target = -1;
		assertArrayEquals(new int[]{1, 2}, solution.twoSum(numbers, target));
	}
}