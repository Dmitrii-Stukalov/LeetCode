package test;

import code.Solution20;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution20Test {
	Solution20 solution = new Solution20();

	@Test
	void firstTest() {
		String s = "()";
		assertTrue(solution.isValid(s));
	}

	@Test
	void secondTest() {
		String s = "()[]{}";
		assertTrue(solution.isValid(s));
	}

	@Test
	void thirdTest() {
		String s = "(]";
		assertFalse(solution.isValid(s));
	}

	@Test
	void firstAdditionalTest() {
		String s = "]";
		assertFalse(solution.isValid(s));
	}
}