package test;

import code.Solution1534;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1534Test {
	Solution1534 solution = new Solution1534();

	@Test
	void firstTest() {
		int[] arr = new int[]{3, 0, 1, 1, 9, 7};
		int a = 7, b = 2, c = 3;
		assertEquals(4, solution.countGoodTriplets(arr, a, b, c));
	}

	@Test
	void secondTest() {
		int[] arr = new int[]{1, 1, 2, 2, 3};
		int a = 0, b = 0, c = 1;
		assertEquals(0, solution.countGoodTriplets(arr, a, b, c));
	}

}