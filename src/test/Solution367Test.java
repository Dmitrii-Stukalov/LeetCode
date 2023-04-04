package test;

import code.Solution367;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Solution367Test {
	Solution367 solution = new Solution367();

	@Test
	void firstTest() {
		int num = 16;
		assertTrue(solution.isPerfectSquare(num));
	}

	@Test
	void secondTest() {
		int num = 14;
		assertFalse(solution.isPerfectSquare(num));
	}

	@Test
	void firstAdditionalTest() {
		int num = 1;
		assertTrue(solution.isPerfectSquare(num));
	}

	@Test
	void secondAdditionalTest() {
		int num = 808201;
		assertTrue(solution.isPerfectSquare(num));
	}

	@Test
	void thirdAdditionalTest() {
		int num = 20;
		assertFalse(solution.isPerfectSquare(num));
	}
}