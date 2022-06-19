package test;

import code.Solution1672;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1672Test {
	Solution1672 solution = new Solution1672();

	@Test
	void firstTest() {
		int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
		assertEquals(6, solution.maximumWealth(accounts));
	}

	@Test
	void secondTest() {
		int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
		assertEquals(10, solution.maximumWealth(accounts));
	}

	@Test
	void thirdTest() {
		int[][] accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
		assertEquals(17, solution.maximumWealth(accounts));
	}
}