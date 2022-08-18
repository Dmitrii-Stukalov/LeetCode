package test;

import code.Solution1338;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1338Test {
	Solution1338 solution = new Solution1338();

	@Test
	void firstTest() {
		int[] arr = new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
		assertEquals(2, solution.minSetSize(arr));
	}

	@Test
	void secondTest() {
		int[] arr = new int[]{7, 7, 7, 7, 7, 7};
		assertEquals(1, solution.minSetSize(arr));
	}

	@Test
	void additionalTest() {
		int[] arr = new int[]{1, 9};
		assertEquals(1, solution.minSetSize(arr));
	}

}