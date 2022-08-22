package test;

import code.Solution936;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution936Test {
	Solution936 solution = new Solution936();

	@Test
	void firstTest() {
		String stamp = "abc", target = "ababc";
		assertArrayEquals(new int[] {0, 2}, solution.movesToStamp(stamp, target));
	}

	@Test
	void secondTest() {
		String stamp = "abca", target = "aabcaca";
		assertArrayEquals(new int[] {3, 0, 1}, solution.movesToStamp(stamp, target));
	}

}