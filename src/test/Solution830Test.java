package test;

import code.Solution830;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution830Test {
	Solution830 solution = new Solution830();

	@Test
	void firstTest() {
		String s = "abbxxxxzzy";
		assertEquals(List.of(List.of(3, 6)), solution.largeGroupPositions(s));
	}

	@Test
	void secondTest() {
		String s = "abc";
		assertEquals(List.of(), solution.largeGroupPositions(s));
	}


	@Test
	void thirdTest() {
		String s = "abcdddeeeeaabbbcd";
		assertEquals(List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14)), solution.largeGroupPositions(s));
	}

	@Test
	void firstAdditionalTest() {
		String s = "aaa";
		assertEquals(List.of(List.of(0, 2)), solution.largeGroupPositions(s));
	}
}