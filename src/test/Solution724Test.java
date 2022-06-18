package test;

import code.Solution724;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution724Test {
	Solution724 solution = new Solution724();

	@Test
	void firstTest() {
		int[] array = {1, 7, 3, 6, 5, 6};
		assertEquals(3, solution.pivotIndex(array));
	}

	@Test
	void secondTest() {
		int[] array = {1, 2, 3};
		assertEquals(-1, solution.pivotIndex(array));
	}

	@Test
	void thirdTest() {
		int[] array = {2, 1, -1};
		assertEquals(0, solution.pivotIndex(array));
	}
}