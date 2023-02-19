package test;

import code.Solution1282;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1282Test {
	Solution1282 solution = new Solution1282();

	@Test
	void firstTest() {
		int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
		assertEquals(List.of(List.of(5), List.of(0, 1, 2), List.of(3, 4, 6)), solution.groupThePeople(groupSizes));
	}

	@Test
	void secondTest() {
		int[] groupSizes = {2, 1, 3, 3, 3, 2};
		assertEquals(List.of(List.of(1), List.of(0, 5), List.of(2, 3, 4)), solution.groupThePeople(groupSizes));
	}
}