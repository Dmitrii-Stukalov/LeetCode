package test;

import code.Solution2011;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2011Test {
	Solution2011 solution = new Solution2011();

	@Test
	void firstTest() {
		String[] operations = new String[] {"--X","X++","X++"};
		assertEquals(1, solution.finalValueAfterOperations(operations));
	}

	@Test
	void secondTest() {
		String[] operations = new String[] {"++X","++X","X++"};
		assertEquals(3, solution.finalValueAfterOperations(operations));
	}

	@Test
	void thirdTest() {
		String[] operations = new String[] {"X++","++X","--X","X--"};
		assertEquals(0, solution.finalValueAfterOperations(operations));
	}
}