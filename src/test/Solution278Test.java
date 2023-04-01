package test;

import code.Solution278;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution278Test {
	Solution278 solution = new Solution278();

	@Test
	void firstTest() {
		int n = 5;
		int bad = 4;
		solution.setBadVersionNumber(bad);
		assertEquals(bad, solution.firstBadVersion(n));
	}

	@Test
	void secondTest() {
		int n = 1;
		int bad = 1;
		solution.setBadVersionNumber(bad);
		assertEquals(bad, solution.firstBadVersion(n));
	}

	@Test
	void thirdTest() {
		int n = 2126753390;
		int bad = 1702766719;
		solution.setBadVersionNumber(bad);
		assertEquals(bad, solution.firstBadVersion(n));
	}
}