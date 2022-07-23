package test;

import code.Solution1689;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1689Test {
	Solution1689 solution = new Solution1689();

	@Test
	void firstTest() {
		String n = "32";
		assertEquals(3, solution.minPartitions(n));
	}

	@Test
	void secondTest() {
		String n = "82734";
		assertEquals(8, solution.minPartitions(n));
	}

	@Test
	void thirdTest() {
		String n = "27346209830709182346";
		assertEquals(9, solution.minPartitions(n));
	}

}