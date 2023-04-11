package test;

import code.Solution2390;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution2390Test {
	Solution2390 solution = new Solution2390();

	@Test
	void firstTest() {
		String s = "leet**cod*e";
		assertEquals("lecoe", solution.removeStars(s));
	}

	@Test
	void secondTest() {
		String s = "erase*****";
		assertEquals("", solution.removeStars(s));
	}
}