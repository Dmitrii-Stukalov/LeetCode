package test;

import code.Solution420;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Solution420Test {
	Solution420 solution = new Solution420();

	@Test
	void firstTest() {
		String password = "a";
		assertEquals(5, solution.strongPasswordChecker(password));
	}

	@Test
	void secondTest() {
		String password = "aA1";
		assertEquals(3, solution.strongPasswordChecker(password));
	}

	@Test
	void thirdTest() {
		String password = "1337C0d3";
		assertEquals(0, solution.strongPasswordChecker(password));
	}
}