package test;

import code.Solution8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {
	Solution8 solution = new Solution8();

	@Test
	void firstTest() {
		String s = "42";
		assertEquals(42, solution.myAtoi(s));
	}

	@Test
	void secondTest() {
		String s = "   -42";
		assertEquals(-42, solution.myAtoi(s));
	}

	@Test
	void thirdTest() {
		String s = "4193 with words";
		assertEquals(4193, solution.myAtoi(s));
	}

	@Test
	void fourthTest() {
		String s = "+-12";
		assertEquals(0, solution.myAtoi(s));
	}

	@Test
	void fifthTest() {
		String s = "words and 987";
		assertEquals(0, solution.myAtoi(s));
	}

	@Test
	void sixthTest() {
		String s = "-+12";
		assertEquals(0, solution.myAtoi(s));
	}

	@Test
	void seventhTest() {
		String s = "21474836460";
		assertEquals(2147483647, solution.myAtoi(s));
	}

	@Test
	void eighthTest() {
		String s = "00000-42a1234";
		assertEquals(0, solution.myAtoi(s));
	}

}