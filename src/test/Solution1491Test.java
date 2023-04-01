package test;

import code.Solution1491;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1491Test {
	Solution1491 solution = new Solution1491();

	@Test
	void firstTest() {
		int[] salary = {4000, 3000, 1000, 2000};
		assertEquals(2500.00000, solution.average(salary), 1e-5);
	}

	@Test
	void secondTest() {
		int[] salary = {1000, 2000, 3000};
		assertEquals(2000.00000, solution.average(salary), 1e-5);
	}

	@Test
	void additionalTest() {
		int[] salary = {8000, 9000, 2000, 3000, 6000, 1000};
		assertEquals(4750.00000, solution.average(salary), 1e-5);
	}
}