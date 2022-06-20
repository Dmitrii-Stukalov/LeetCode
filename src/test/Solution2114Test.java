package test;

import code.Solution2114;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2114Test {
	Solution2114 solution = new Solution2114();

	@Test
	void firstTest() {
		String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		assertEquals(6, solution.mostWordsFound(sentences));
	}

	@Test
	void secondTest() {
		String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};
		assertEquals(3, solution.mostWordsFound(sentences));
	}

}