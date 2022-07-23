package test;

import code.Solution1512;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1512Test {
	Solution1512 solution = new Solution1512();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 2, 3, 1, 1, 3};
		assertEquals(4, solution.numIdenticalPairs(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{1, 1, 1, 1};
		assertEquals(6, solution.numIdenticalPairs(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{1, 2, 3};
		assertEquals(0, solution.numIdenticalPairs(nums));
	}

}