package test;

import code.Solution1020;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1020Test {
	Solution1020 solution = new Solution1020();

	@Test
	void firstTest() {
		int[][] grid = {
				{0, 0, 0, 0},
				{1, 0, 1, 0},
				{0, 1, 1, 0},
				{0, 0, 0, 0}
		};
		assertEquals(3, solution.numEnclaves(grid));
	}

	@Test
	void secondTest() {
		int[][] grid = {
				{0, 1, 1, 0},
				{0, 0, 1, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 0}
		};
		assertEquals(0, solution.numEnclaves(grid));
	}
}