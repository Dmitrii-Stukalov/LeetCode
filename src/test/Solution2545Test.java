package test;

import code.Solution2545;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2545Test {
	Solution2545 solution = new Solution2545();

	@Test
	void firstTest() {
		int[][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};
		int k = 2;
		assertArrayEquals(new int[][]{{7, 5, 11, 2}, {10, 6, 9, 1}, {4, 8, 3, 15}}, solution.sortTheStudents(score, k));
	}

	@Test
	void secondTest() {
		int[][] score = {{3, 4}, {5, 6}};
		int k = 0;
		assertArrayEquals(new int[][]{{5, 6}, {3, 4}}, solution.sortTheStudents(score, k));
	}
}