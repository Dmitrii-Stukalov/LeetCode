package test;

import code.Solution1011;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1011Test {
	Solution1011 solution = new Solution1011();

	@Test
	void firstTest() {
		int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int days = 5;
		assertEquals(15, solution.shipWithinDays(weights, days));
	}

	@Test
	void secondTest() {
		int[] weights = {3, 2, 2, 4, 1, 4};
		int days = 3;
		assertEquals(6, solution.shipWithinDays(weights, days));
	}

	@Test
	void thirdTest() {
		int[] weights = {1, 2, 3, 1, 1};
		int days = 4;
		assertEquals(3, solution.shipWithinDays(weights, days));
	}
}