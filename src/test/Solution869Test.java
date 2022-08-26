package test;

import code.Solution869;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution869Test {
	Solution869 solution = new Solution869();

	@Test
	void firstTest() {
		int n = 1;
		assertTrue(solution.reorderedPowerOf2(n));
	}

	@Test
	void secondTest() {
		int n = 10;
		assertFalse(solution.reorderedPowerOf2(n));
	}

	@Test
	void thirdTest() {
		int n = 1024;
		assertTrue(solution.reorderedPowerOf2(n));
	}
}