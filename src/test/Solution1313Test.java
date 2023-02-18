package test;

import code.Solution1313;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1313Test {
	Solution1313 solution = new Solution1313();

	@Test
	void firstTest() {
		int[] nums = {1, 2, 3, 4};
		assertArrayEquals(new int[]{2, 4, 4, 4}, solution.decompressRLElist(nums));
	}

	@Test
	void secondTest() {
		int[] nums = {1, 1, 2, 3};
		assertArrayEquals(new int[]{1, 3, 3}, solution.decompressRLElist(nums));
	}
}