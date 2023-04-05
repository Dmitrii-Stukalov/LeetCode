package test;

import code.Solution1905;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1905Test {
	Solution1905 solution = new Solution1905();

	@Test
	void firstTest() {
		int[][] grid1 = {
				{1, 1, 1, 0, 0},
				{0, 1, 1, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 1, 1}};
		int[][] grid2 = {
				{1, 1, 1, 0, 0},
				{0, 0, 1, 1, 1},
				{0, 1, 0, 0, 0},
				{1, 0, 1, 1, 0},
				{0, 1, 0, 1, 0}};
		assertEquals(3, solution.countSubIslands(grid1, grid2));
	}

	@Test
	void secondTest() {
		int[][] grid1 = {
				{1, 0, 1, 0, 1},
				{1, 1, 1, 1, 1},
				{0, 0, 0, 0, 0},
				{1, 1, 1, 1, 1},
				{1, 0, 1, 0, 1}};
		int[][] grid2 = {
				{0, 0, 0, 0, 0},
				{1, 1, 1, 1, 1},
				{0, 1, 0, 1, 0},
				{0, 1, 0, 1, 0},
				{1, 0, 0, 0, 1}};
		assertEquals(2, solution.countSubIslands(grid1, grid2));
	}
}