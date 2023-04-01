package test;

import code.Solution1523;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1523Test {
	Solution1523 solution = new Solution1523();

	@Test
	void firstTest() {
		int low = 3, high = 7;
		assertEquals(3, solution.countOdds(low, high));
	}

	@Test
	void secondTest() {
		int low = 8, high = 10;
		assertEquals(1, solution.countOdds(low, high));
	}
}