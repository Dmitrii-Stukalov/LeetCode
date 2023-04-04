package test;

import code.Solution2405;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution2405Test {
	Solution2405 solution = new Solution2405();

	@Test
	void firstTest() {
		String s = "abacaba";
		assertEquals(4, solution.partitionString(s));
	}

	@Test
	void secondTest() {
		String s = "ssssss";
		assertEquals(6, solution.partitionString(s));
	}
}