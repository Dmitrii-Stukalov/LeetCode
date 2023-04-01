package test;

import code.Solution2520;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution2520Test {
	Solution2520 solution = new Solution2520();

	@Test
	void firstTest() {
		int num = 7;
		assertEquals(1, solution.countDigits(num));
	}

	@Test
	void secondTest() {
		int num = 121;
		assertEquals(2, solution.countDigits(num));
	}

	@Test
	void thirdTest() {
		int num = 1248;
		assertEquals(4, solution.countDigits(num));
	}
}