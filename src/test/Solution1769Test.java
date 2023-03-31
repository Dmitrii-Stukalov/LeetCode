package test;

import code.Solution1769;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution1769Test {
	Solution1769 solution = new Solution1769();

	@Test
	void firstTest() {
		String boxes = "110";
		assertArrayEquals(new int[]{1, 1, 3}, solution.minOperations(boxes));
	}

	@Test
	void secondTest() {
		String boxes = "001011";
		assertArrayEquals(new int[]{11, 8, 5, 4, 3, 4}, solution.minOperations(boxes));
	}
}