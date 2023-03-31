package test;

import code.Solution1444;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1444Test {
	Solution1444 solution = new Solution1444();

	@Test
	void firstTest() {
		String[] pizza = {"A..", "AAA", "..."};
		int k = 3;
		assertEquals(3, solution.ways(pizza, k));
	}

	@Test
	void secondTest() {
		String[] pizza = {"A..", "AA.", "..."};
		int k = 3;
		assertEquals(1, solution.ways(pizza, k));
	}

	@Test
	void thirdTest() {
		String[] pizza = {"A..", "A..", "..."};
		int k = 1;
		assertEquals(1, solution.ways(pizza, k));
	}
}