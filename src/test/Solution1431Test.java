package test;

import code.Solution1431;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1431Test {
	Solution1431 solution = new Solution1431();

	@Test
	void firstTest() {
		int[] candies = new int[]{2, 3, 5, 1, 3};
		int extraCandies = 3;
		assertEquals(List.of(true, true, true, false, true), solution.kidsWithCandies(candies, extraCandies));
	}

	@Test
	void secondTest() {
		int[] candies = new int[]{4, 2, 1, 1, 2};
		int extraCandies = 1;
		assertEquals(List.of(true, false, false, false, false), solution.kidsWithCandies(candies, extraCandies));
	}

	@Test
	void thirdTest() {
		int[] candies = new int[]{12, 1, 12};
		int extraCandies = 10;
		assertEquals(List.of(true, false, true), solution.kidsWithCandies(candies, extraCandies));
	}
}