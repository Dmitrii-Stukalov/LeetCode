package test;

import code.Solution1828;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1828Test {
	Solution1828 solution = new Solution1828();

	@Test
	void firstTest() {
		int[][] points = new int[][]{new int[]{1, 3}, new int[]{3, 3}, new int[]{5, 3}, new int[]{2, 2}};
		int[][] queries = new int[][]{new int[]{2, 3, 1}, new int[]{4, 3, 1}, new int[]{1, 1, 2}};
		assertArrayEquals(new int[]{3, 2, 2}, solution.countPoints(points, queries));
	}

	@Test
	void secondTest() {
		int[][] points = new int[][]{new int[]{1, 1}, new int[]{2, 2}, new int[]{3, 3}, new int[]{4, 4}, new int[]{5, 5}};
		int[][] queries = new int[][]{new int[]{1, 2, 2}, new int[]{2, 2, 2}, new int[]{4, 3, 2}, new int[]{4, 3, 3}};
		assertArrayEquals(new int[]{2, 3, 2, 4}, solution.countPoints(points, queries));
	}

}