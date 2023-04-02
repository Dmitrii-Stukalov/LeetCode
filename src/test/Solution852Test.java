package test;

import code.Solution852;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution852Test {
	Solution852 solution = new Solution852();

	@Test
	void firstTest() {
		int[] arr = {0, 1, 0};
		assertEquals(1, solution.peakIndexInMountainArray(arr));
	}

	@Test
	void secondTest() {
		int[] arr = {0, 2, 1, 0};
		assertEquals(1, solution.peakIndexInMountainArray(arr));
	}

	@Test
	void thirdTest() {
		int[] arr = {0, 10, 5, 2};
		assertEquals(1, solution.peakIndexInMountainArray(arr));
	}
}