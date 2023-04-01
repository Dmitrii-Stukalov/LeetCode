package test;

import code.Solution509;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution509Test {
	Solution509 solution = new Solution509();

	@Test
	void firstTest() {
		int n = 2;
		assertEquals(1, solution.fib(n));
	}

	@Test
	void secondTest() {
		int n = 3;
		assertEquals(2, solution.fib(n));
	}

	@Test
	void thirdTest() {
		int n = 4;
		assertEquals(3, solution.fib(n));
	}
}