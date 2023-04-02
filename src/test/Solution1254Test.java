package test;

import code.Solution1254;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1254Test {
	Solution1254 solution = new Solution1254();

	@Test
	void firstTest() {
		int[][] grid = {
				{1, 1, 1, 1, 1, 1, 1, 0},
				{1, 0, 0, 0, 0, 1, 1, 0},
				{1, 0, 1, 0, 1, 1, 1, 0},
				{1, 0, 0, 0, 0, 1, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 0}};
		assertEquals(2, solution.closedIsland(grid));
	}

	@Test
	void secondTest() {
		int[][] grid = {
				{0, 0, 1, 0, 0},
				{0, 1, 0, 1, 0},
				{0, 1, 1, 1, 0}};
		assertEquals(1, solution.closedIsland(grid));
	}

	@Test
	void thirdTest() {
		int[][] grid = {
				{1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 0, 1},
				{1, 0, 1, 1, 1, 0, 1},
				{1, 0, 1, 0, 1, 0, 1},
				{1, 0, 1, 1, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1}};
		assertEquals(2, solution.closedIsland(grid));
	}

	@Test
	void additionalTest() {
		int[][] grid = {
				{0, 0, 1, 1, 0, 1, 0, 0, 1, 0},
				{1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
				{1, 0, 1, 1, 1, 0, 0, 1, 1, 0},
				{0, 1, 1, 0, 0, 0, 0, 1, 0, 1},
				{0, 0, 0, 0, 0, 0, 1, 1, 1, 0},
				{0, 1, 0, 1, 0, 1, 0, 1, 1, 1},
				{1, 0, 1, 0, 1, 1, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 1, 0, 1, 0, 1},
				{1, 1, 1, 0, 1, 1, 0, 1, 1, 0}};
		assertEquals(5, solution.closedIsland(grid));
	}
}