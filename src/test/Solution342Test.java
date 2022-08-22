package test;

import code.Solution342;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution342Test {
	Solution342 solution = new Solution342();

	@Test
	void firstTest() {
		int n = 16;
		assertTrue(solution.isPowerOfFour(n));
	}

	@Test
	void secondTest() {
		int n = 5;
		assertFalse(solution.isPowerOfFour(n));
	}

	@Test
	void thirdTest() {
		int n = 1;
		assertTrue(solution.isPowerOfFour(n));
	}
}