package test;

import code.Solution766;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution766Test {
	Solution766 solution = new Solution766();

	@Test
	void firstTest() {
		int[][] matrix = new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 1, 2, 3}, new int[]{9, 5, 1, 2}};
		assertTrue(solution.isToeplitzMatrix(matrix));
	}

	@Test
	void secondTest() {
		int[][] matrix = new int[][]{new int[]{1, 2}, new int[]{2, 2}};
		assertFalse(solution.isToeplitzMatrix(matrix));
	}
}