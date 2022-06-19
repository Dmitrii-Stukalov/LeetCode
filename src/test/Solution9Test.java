package test;

import code.Solution9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution9Test {
	Solution9 solution = new Solution9();

	@Test
	void firstTest() {
		int x = 121;
		assertTrue(solution.isPalindrome(x));
	}

	@Test
	void secondTest() {
		int x = -121;
		assertFalse(solution.isPalindrome(x));
	}

	@Test
	void thirdTest() {
		int x = 10;
		assertFalse(solution.isPalindrome(x));
	}

}