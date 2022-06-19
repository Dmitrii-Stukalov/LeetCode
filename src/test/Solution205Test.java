package test;

import code.Solution205;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution205Test {
	Solution205 solution = new Solution205();

	@Test
	void firstTest() {
		String s = "egg";
		String t = "add";
		assertTrue(solution.isIsomorphic(s, t));
	}

	@Test
	void secondTest() {
		String s = "foo";
		String t = "bar";
		assertFalse(solution.isIsomorphic(s, t));
	}

	@Test
	void thirdTest() {
		String s = "paper";
		String t = "title";
		assertTrue(solution.isIsomorphic(s, t));
	}

	@Test
	void firstAdditionalTest() {
		String s = "bbbaaaba";
		String t = "aaabbbba";
		assertFalse(solution.isIsomorphic(s, t));
	}

	@Test
	void secondAdditionalTest() {
		String s = "badc";
		String t = "baba";
		assertFalse(solution.isIsomorphic(s, t));
	}
}