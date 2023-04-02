package test;

import code.Solution746;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution746Test {
	Solution746 solution = new Solution746();

	@Test
	void firstTest() {
		int[] cost = {10, 15, 20};
		assertEquals(15, solution.minCostClimbingStairs(cost));
	}

	@Test
	void secondTest() {
		int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		assertEquals(6, solution.minCostClimbingStairs(cost));
	}
}