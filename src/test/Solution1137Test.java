package test;

import code.Solution1137;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1137Test {
	Solution1137 solution = new Solution1137();

	@Test
	void firstTest() {
		int n = 4;
		assertEquals(4, solution.tribonacci(n));
	}

	@Test
	void secondTest() {
		int n = 25;
		assertEquals(1389537, solution.tribonacci(n));
	}
}