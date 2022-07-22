package test;

import code.Solution15;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution15Test {
	Solution15 solution = new Solution15();

	@Test
	void firstTest() {
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), solution.threeSum(nums));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{0, 1, 1};
		assertEquals(List.of(), solution.threeSum(nums));
	}

	@Test
	void thirdTest() {
		int[] nums = new int[]{0, 0, 0};
		assertEquals(List.of(List.of(0, 0, 0)), solution.threeSum(nums));
	}
}