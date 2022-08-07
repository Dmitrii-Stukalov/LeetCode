package test;

import code.Solution383;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution383Test {
	Solution383 solution = new Solution383();

	@Test
	void firstTest() {
		String ransomNote = "a", magazine = "b";
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}

	@Test
	void secondTest() {
		String ransomNote = "aa", magazine = "ab";
		assertFalse(solution.canConstruct(ransomNote, magazine));
	}

	@Test
	void thirdTest() {
		String ransomNote = "aa", magazine = "aab";
		assertTrue(solution.canConstruct(ransomNote, magazine));
	}

}