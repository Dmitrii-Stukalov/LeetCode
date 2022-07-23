package test;

import code.Solution2160;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2160Test {
	Solution2160 solution = new Solution2160();

	@Test
	void firstTest() {
		int num = 2932;
		assertEquals(52, solution.minimumSum(num));
	}

	@Test
	void secondTest() {
		int num = 4009;
		assertEquals(13, solution.minimumSum(num));
	}

}