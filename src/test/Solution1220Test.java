package test;

import code.Solution1220;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1220Test {
	Solution1220 solution = new Solution1220();

	@Test
	void firstTest() {
		int n = 1;
		assertEquals(5, solution.countVowelPermutation(n));
	}

	@Test
	void secondTest() {
		int n = 2;
		assertEquals(10, solution.countVowelPermutation(n));
	}

	@Test
	void thirdTest() {
		int n = 5;
		assertEquals(68, solution.countVowelPermutation(n));
	}

}