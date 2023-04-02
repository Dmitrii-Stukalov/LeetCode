package test;

import code.Solution695;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution695Test {
	Solution695 solution = new Solution695();

	@Test
	void firstTest() {
		int[][] grid = {
				{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
				{0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
		assertEquals(6, solution.maxAreaOfIsland(grid));
	}

	@Test
	void secondTest() {
		int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};
		assertEquals(0, solution.maxAreaOfIsland(grid));
	}
}