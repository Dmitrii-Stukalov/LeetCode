package test;

import code.Solution120;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution120Test {
	Solution120 solution = new Solution120();


	@Test
	void firstTest() {
		List<List<Integer>> triangle = List.of(List.of(2), List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3));
		assertEquals(11, solution.minimumTotal(triangle));
	}

	@Test
	void secondTest() {
		List<List<Integer>> triangle = List.of(List.of(-10));
		assertEquals(-10, solution.minimumTotal(triangle));
	}

}