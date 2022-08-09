package test;

import code.Solution1572;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1572Test {
	Solution1572 solution = new Solution1572();

	@Test
	void firstTest() {
		int[][] mat = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
		assertEquals(25, solution.diagonalSum(mat));
	}

	@Test
	void secondTest() {
		int[][] mat = new int[][]{new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}};
		assertEquals(8, solution.diagonalSum(mat));
	}

	@Test
	void thirdTest() {
		int[][] mat = new int[][]{new int[]{5}};
		assertEquals(5, solution.diagonalSum(mat));
	}
}