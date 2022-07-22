package test;

import code.Solution1995;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1995Test {
	Solution1995 solution = new Solution1995();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 2, 3, 6};
		assertEquals(1, solution.countQuadruplets(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{3, 3, 6, 4, 5};
		assertEquals(0, solution.countQuadruplets(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{1, 1, 1, 3, 5};
		assertEquals(4, solution.countQuadruplets(nums));
	}

}