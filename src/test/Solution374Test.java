package test;

import code.Solution374;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution374Test {
	Solution374 solution = new Solution374();

	@Test
	void firstTest() {
		int n = 10, pick = 6;
		solution.setPicked(pick);
		assertEquals(pick, solution.guessNumber(n));
	}

	@Test
	void secondTest() {
		int n = 1, pick = 1;
		solution.setPicked(pick);
		assertEquals(pick, solution.guessNumber(n));
	}

	@Test
	void thirdTest() {
		int n = 2, pick = 1;
		solution.setPicked(pick);
		assertEquals(pick, solution.guessNumber(n));
	}
}