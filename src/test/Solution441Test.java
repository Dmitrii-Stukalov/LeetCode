package test;

import code.Solution441;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution441Test {
	Solution441 solution = new Solution441();

	@Test
	void firstTest() {
		int n = 5;
		assertEquals(2, solution.arrangeCoins(n));
	}

	@Test
	void secondTest() {
		int n = 8;
		assertEquals(3, solution.arrangeCoins(n));
	}

	@Test
	void firstAdditionalTest() {
		int n = 1;
		assertEquals(1, solution.arrangeCoins(n));
	}

	@Test
	void secondAdditionalTest() {
		int n = 1804289383;
		assertEquals(60070, solution.arrangeCoins(n));
	}
}