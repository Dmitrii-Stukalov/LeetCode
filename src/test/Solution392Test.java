package test;

import code.Solution392;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution392Test {
	Solution392 solution = new Solution392();

	@Test
	void firstTest() {
		String s = "abc";
		String t = "ahbgdc";
		assertTrue(solution.isSubsequence(s, t));
	}

	@Test
	void secondTest() {
		String s = "axc";
		String t = "ahbgdc";
		assertFalse(solution.isSubsequence(s, t));
	}
}