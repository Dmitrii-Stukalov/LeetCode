package test;

import code.Solution744;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution744Test {
	Solution744 solution = new Solution744();

	@Test
	void firstTest() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'a';
		assertEquals('c', solution.nextGreatestLetter(letters, target));
	}

	@Test
	void secondTest() {
		char[] letters = {'c', 'f', 'j'};
		char target = 'c';
		assertEquals('f', solution.nextGreatestLetter(letters, target));
	}

	@Test
	void thirdTest() {
		char[] letters = {'x', 'x', 'y', 'y'};
		char target = 'z';
		assertEquals('x', solution.nextGreatestLetter(letters, target));
	}
}