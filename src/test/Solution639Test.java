package test;

import code.Solution639;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution639Test {
	Solution639 solution = new Solution639();

	@Test
	void firstTest() {
		String s = "*";
		assertEquals(9, solution.numDecodings(s));
	}

	@Test
	void secondTest() {
		String s = "1*";
		assertEquals(18, solution.numDecodings(s));
	}

	@Test
	void thirdTest() {
		String s = "2*";
		assertEquals(15, solution.numDecodings(s));
	}

}