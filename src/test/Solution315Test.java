package test;

import code.Solution315;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution315Test {
	Solution315 solution = new Solution315();

	@Test
	void firstTest() {
		int[] nums = new int[]{5, 2, 6, 1};
		assertEquals(List.of(2, 1, 1, 0), solution.countSmaller(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{-1};
		assertEquals(List.of(0), solution.countSmaller(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{-1, -1};
		assertEquals(List.of(0, 0), solution.countSmaller(nums));
	}

}