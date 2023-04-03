package test;

import code.Solution881;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution881Test {
	Solution881 solution = new Solution881();

	@Test
	void firstTest() {
		int[] people = {1, 2};
		int limit = 3;
		assertEquals(1, solution.numRescueBoats(people, limit));
	}

	@Test
	void secondTest() {
		int[] people = {3, 2, 2, 1};
		int limit = 3;
		assertEquals(3, solution.numRescueBoats(people, limit));
	}

	@Test
	void thirdTest() {
		int[] people = {3, 5, 3, 4};
		int limit = 5;
		assertEquals(4, solution.numRescueBoats(people, limit));
	}
}