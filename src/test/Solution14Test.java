package test;

import code.Solution14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution14Test {
	Solution14 solution = new Solution14();

	@Test
	void firstTest() {
		String[] strs = new String[]{"flower", "flow", "flight"};
		assertEquals("fl", solution.longestCommonPrefix(strs));
	}

	@Test
	void secondTest() {
		String[] strs = new String[]{"dog", "racecar", "car"};
		assertEquals("", solution.longestCommonPrefix(strs));
	}

}