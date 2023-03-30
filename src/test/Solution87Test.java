package test;

import code.Solution87;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Solution87Test {
	Solution87 solution = new Solution87();

	@Test
	void firstTest() {
		String s1 = "great";
		String s2 = "rgeat";
		assertTrue(solution.isScramble(s1, s2));
	}

	@Test
	void secondTest() {
		String s1 = "abcde";
		String s2 = "caebd";
		assertFalse(solution.isScramble(s1, s2));
	}

	@Test
	void thirdTest() {
		String s1 = "a";
		String s2 = "a";
		assertTrue(solution.isScramble(s1, s2));
	}

	@Test
	void additionalTest() {
		String s1 = "abcdbdacbdac";
		String s2 = "bdacabcdbdac";
		assertTrue(solution.isScramble(s1, s2));
	}
}