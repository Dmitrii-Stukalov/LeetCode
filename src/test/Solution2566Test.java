package test;

import code.Solution2566;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2566Test {
	Solution2566 solution = new Solution2566();

	@Test
	void firstTest() {
		int num = 11891;
		assertEquals(99009, solution.minMaxDifference(num));
	}

	@Test
	void secondTest() {
		int num = 90;
		assertEquals(99, solution.minMaxDifference(num));
	}
}