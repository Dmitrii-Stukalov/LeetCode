package test;

import code.Solution1857;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1857Test {
	Solution1857 solution = new Solution1857();

	@Test
	void firstTest() {
		String colors = "abaca";
		int[][] edges = {
				{0, 1},
				{0, 2},
				{2, 3},
				{3, 4}};
		assertEquals(3, solution.largestPathValue(colors, edges));
	}

	@Test
	void secondTest() {
		String colors = "a";
		int[][] edges = {{0, 0}};
		assertEquals(-1, solution.largestPathValue(colors, edges));
	}
}