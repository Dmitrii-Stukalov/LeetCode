package test;

import code.Solution191;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution191Test {
	Solution191 solution = new Solution191();

	@Test
	void firstTest() {
		int n = 0b00000000000000000000000000001011;
		assertEquals(3, solution.hammingWeight(n));
	}

	@Test
	void secondTest() {
		int n = 0b00000000000000000000000010000000;
		assertEquals(1, solution.hammingWeight(n));
	}

	@Test
	void thirdTest() {
		int n = 0b11111111111111111111111111111101;
		assertEquals(31, solution.hammingWeight(n));
	}
}