package test;

import code.Solution13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {
	Solution13 solution = new Solution13();

	@Test
	void firstTest() {
		String s = "III";
		assertEquals(3, solution.romanToInt(s));
	}

	@Test
	void secondTest() {
		String s = "LVIII";
		assertEquals(58, solution.romanToInt(s));
	}

	@Test
	void thirdTest() {
		String s = "MCMXCIV";
		assertEquals(1994, solution.romanToInt(s));
	}
}