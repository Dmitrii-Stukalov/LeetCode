package test;

import code.Solution733;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution733Test {
	Solution733 solution = new Solution733();

	@Test
	void firstTest() {
		int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
		int sr = 1, sc = 1, color = 2;
		assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, solution.floodFill(image, sr, sc, color));
	}

	@Test
	void secondTest() {
		int[][] image = {{0, 0, 0}, {0, 0, 0}};
		int sr = 0, sc = 0, color = 0;
		assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}}, solution.floodFill(image, sr, sc, color));
	}
}