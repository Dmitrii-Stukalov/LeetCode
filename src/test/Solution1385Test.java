package test;

import code.Solution1385;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1385Test {
	Solution1385 solution = new Solution1385();

	@Test
	void firstTest() {
		int[] arr1 = {4, 5, 8};
		int[] arr2 = {10, 9, 1, 8};
		int d = 2;
		assertEquals(2, solution.findTheDistanceValue(arr1, arr2, d));
	}

	@Test
	void secondTest() {
		int[] arr1 = {1, 4, 2, 3};
		int[] arr2 = {-4, -3, 6, 10, 20, 30};
		int d = 3;
		assertEquals(2, solution.findTheDistanceValue(arr1, arr2, d));
	}

	@Test
	void thirdTest() {
		int[] arr1 = {2, 1, 100, 3};
		int[] arr2 = {-5, -2, 10, -3, 7};
		int d = 6;
		assertEquals(1, solution.findTheDistanceValue(arr1, arr2, d));
	}

	@Test
	void additionalTest() {
		int[] arr1 = {4, -3, -7, 0, -10};
		int[] arr2 = {10};
		int d = 69;
		assertEquals(0, solution.findTheDistanceValue(arr1, arr2, d));
	}
}