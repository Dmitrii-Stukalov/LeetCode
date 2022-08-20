package test;

import code.Solution871;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution871Test {
	Solution871 solution = new Solution871();

	@Test
	void firstTest() {
		int target = 1;
		int startFuel = 1;
		int[][] stations = new int[0][0];
		assertEquals(0, solution.minRefuelStops(target, startFuel, stations));
	}

	@Test
	void secondTest() {
		int target = 100;
		int startFuel = 1;
		int[][] stations = new int[][]{new int[]{10, 100}};
		assertEquals(-1, solution.minRefuelStops(target, startFuel, stations));
	}

	@Test
	void thirdTest() {
		int target = 100;
		int startFuel = 10;
		int[][] stations = new int[][]{new int[]{10, 60}, new int[]{20, 30}, new int[]{30, 30}, new int[]{60, 40}};
		assertEquals(2, solution.minRefuelStops(target, startFuel, stations));
	}

	@Test
	void firstAdditionalTest() {
		int target = 100;
		int startFuel = 1;
		int[][] stations = new int[0][0];
		assertEquals(-1, solution.minRefuelStops(target, startFuel, stations));
	}

	@Test
	void secondAdditionalTest() {
		int target = 100;
		int startFuel = 50;
		int[][] stations = new int[][]{new int[]{25, 50}, new int[]{50, 25}};
		assertEquals(1, solution.minRefuelStops(target, startFuel, stations));
	}
}