package test;

import code.Solution1255;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1255Test {
	Solution1255 solution = new Solution1255();

	@Test
	void firstTest() {
		String[] words = new String[]{"dog", "cat", "dad", "good"};
		char[] letters = new char[]{'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
		int[] score = new int[]{1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		assertEquals(23, solution.maxScoreWords(words, letters, score));
	}

	@Test
	void secondTest() {
		String[] words = new String[]{"xxxz", "ax", "bx", "cx"};
		char[] letters = new char[]{'z', 'a', 'b', 'c', 'x', 'x', 'x'};
		int[] score = new int[]{4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 10};
		assertEquals(27, solution.maxScoreWords(words, letters, score));
	}

	@Test
	void thirdTest() {
		String[] words = new String[]{"leetcode"};
		char[] letters = new char[]{'l', 'e', 't', 'c', 'o', 'd'};
		int[] score = new int[]{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
		assertEquals(0, solution.maxScoreWords(words, letters, score));
	}
}