package test;

import code.Solution2235;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2235Test {
	Solution2235 solution = new Solution2235();

	@Test
	void firstTest() {
		int num1 = 12;
		int num2 = 5;
		assertEquals(17, solution.sum(num1, num2));
	}

	@Test
	void secondTest() {
		int num1 = -10;
		int num2 = 4;
		assertEquals(-6, solution.sum(num1, num2));
	}

}