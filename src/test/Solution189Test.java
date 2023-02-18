package test;

import code.Solution189;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution189Test {
	Solution189 solution = new Solution189();

	@Test
	void firstTest() {
		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		solution.rotate(nums, k);
		assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
	}

	@Test
	void secondTest() {
		int[] nums = {-1, -100, 3, 99};
		int k = 2;
		solution.rotate(nums, k);
		assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
	}

	@Test
	void thirdTest() {
		int[] nums = {1};
		int k = 0;
		solution.rotate(nums, k);
		assertArrayEquals(new int[]{1}, nums);
	}

	@Test
	void fourthTest() {
		int[] nums = {1};
		int k = 1;
		solution.rotate(nums, k);
		assertArrayEquals(new int[]{1}, nums);
	}

	@Test
	void fifthTest() {
		int[] nums = {-1};
		int k = 2;
		solution.rotate(nums, k);
		assertArrayEquals(new int[]{-1}, nums);
	}
}