package test;

import code.Solution1528;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1528Test {
	Solution1528 solution = new Solution1528();

	@Test
	void firstTest() {
		String s = "codeleet";
		int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
		assertEquals("leetcode", solution.restoreString(s, indices));
	}

	@Test
	void secondTest() {
		String s = "abc";
		int[] indices = {0, 1, 2};
		assertEquals("abc", solution.restoreString(s, indices));
	}
}