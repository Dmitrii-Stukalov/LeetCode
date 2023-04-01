package test;

import code.Solution1221;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1221Test {
	Solution1221 solution = new Solution1221();

	@Test
	void firstTest() {
		String s = "RLRRLLRLRL";
		assertEquals(4, solution.balancedStringSplit(s));
	}

	@Test
	void secondTest() {
		String s = "RLRRRLLRLL";
		assertEquals(2, solution.balancedStringSplit(s));
	}

	@Test
	void thirdTest() {
		String s = "LLLLRRRR";
		assertEquals(1, solution.balancedStringSplit(s));
	}
}