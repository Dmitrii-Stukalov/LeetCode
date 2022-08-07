package test;

import code.Solution1342;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1342Test {
	Solution1342 solution = new Solution1342();

	@Test
	void firstTest() {
		int num = 14;
		assertEquals(6, solution.numberOfSteps(num));
	}

	@Test
	void secondTest() {
		int num = 8;
		assertEquals(4, solution.numberOfSteps(num));
	}

	@Test
	void thirdTest() {
		int num = 123;
		assertEquals(12, solution.numberOfSteps(num));
	}

}