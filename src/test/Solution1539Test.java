package test;

import code.Solution1539;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1539Test {
	Solution1539 solution = new Solution1539();

	@Test
	void firstTest() {
		int[] arr = {2, 3, 4, 7, 11};
		int k = 5;
		assertEquals(9, solution.findKthPositive(arr, k));
	}

	@Test
	void secondTest() {
		int[] arr = {1, 2, 3, 4};
		int k = 2;
		assertEquals(6, solution.findKthPositive(arr, k));
	}

	@Test
	void additionalTest() {
		int[] arr = {2};
		int k = 1;
		assertEquals(1, solution.findKthPositive(arr, k));
	}
}