package test;

import code.Solution35;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution35Test {
	Solution35 solution = new Solution35();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 3, 5, 6};
		int target = 5;
		assertEquals(2, solution.searchInsert(nums, target));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{1, 3, 5, 6};
		int target = 2;
		assertEquals(1, solution.searchInsert(nums, target));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{1, 3, 5, 6};
		int target = 7;
		assertEquals(4, solution.searchInsert(nums, target));
	}

}