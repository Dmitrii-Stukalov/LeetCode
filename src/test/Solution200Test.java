package test;

import code.Solution200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution200Test {
	Solution200 solution = new Solution200();

	@Test
	void firstTest() {
		char[][] grid = {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		assertEquals(1, solution.numIslands(grid));
	}

	@Test
	void secondTest() {
		char[][] grid = {
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		assertEquals(3, solution.numIslands(grid));
	}

	@Test
	void thirdTest() {
		char[][] grid = {
				{'1', '1', '1'},
				{'0', '1', '0'},
				{'1', '1', '1'}
		};
		assertEquals(1, solution.numIslands(grid));
	}
}