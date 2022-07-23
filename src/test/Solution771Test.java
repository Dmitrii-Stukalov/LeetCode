package test;

import code.Solution771;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution771Test {
	Solution771 solution = new Solution771();

	@Test
	void firstTest() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		assertEquals(3, solution.numJewelsInStones(jewels, stones));
	}

	@Test
	void secondTest() {
		String jewels = "z";
		String stones = "ZZ";
		assertEquals(0, solution.numJewelsInStones(jewels, stones));
	}

}