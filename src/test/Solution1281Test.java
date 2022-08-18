package test;

import code.Solution1281;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1281Test {
	Solution1281 solution = new Solution1281();

	@Test
	void firstTest() {
		int n = 234;
		assertEquals(15, solution.subtractProductAndSum(n));
	}

	@Test
	void secondTest() {
		int n = 4421;
		assertEquals(21, solution.subtractProductAndSum(n));
	}

}