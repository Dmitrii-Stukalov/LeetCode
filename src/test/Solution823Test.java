package test;

import code.Solution823;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution823Test {
	Solution823 solution = new Solution823();

	@Test
	void firstTest() {
		int[] arr = new int[]{2, 4};
		assertEquals(3, solution.numFactoredBinaryTrees(arr));
	}

	@Test
	void secondTest() {
		int[] arr = new int[]{2, 4, 5, 10};
		assertEquals(7, solution.numFactoredBinaryTrees(arr));
	}

}