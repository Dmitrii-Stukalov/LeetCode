package test;

import code.Solution18;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution18Test {
	Solution18 solution = new Solution18();

	@Test
	void firstTest() {
		int[] nums = new int[]{1, 0, -1, 0, -2, 2};
		int target = 0;
		assertEquals(List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1)), solution.fourSum(nums, target));
	}

	@Test
	void secondTest() {
		int[] nums = new int[]{2, 2, 2, 2, 2};
		int target = 8;
		assertEquals(List.of(List.of(2, 2, 2, 2)), solution.fourSum(nums, target));
	}

	@Test
	void firstAdditionalTest() {
		int[] nums = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90};
		int target = 200;
		assertEquals(List.of(List.of(10, 10, 90, 90), List.of(10, 20, 80, 90), List.of(10, 30, 70, 90), List.of(10, 30, 80, 80), List.of(10, 40, 60, 90), List.of(10, 40, 70, 80), List.of(10, 50, 50, 90), List.of(10, 50, 60, 80), List.of(10, 50, 70, 70), List.of(10, 60, 60, 70), List.of(20, 20, 70, 90), List.of(20, 20, 80, 80), List.of(20, 30, 60, 90), List.of(20, 30, 70, 80), List.of(20, 40, 50, 90), List.of(20, 40, 60, 80), List.of(20, 40, 70, 70), List.of(20, 50, 50, 80), List.of(20, 50, 60, 70), List.of(20, 60, 60, 60), List.of(30, 30, 50, 90), List.of(30, 30, 60, 80), List.of(30, 30, 70, 70), List.of(30, 40, 40, 90), List.of(30, 40, 50, 80), List.of(30, 40, 60, 70), List.of(30, 50, 50, 70), List.of(30, 50, 60, 60), List.of(40, 40, 40, 80), List.of(40, 40, 50, 70), List.of(40, 40, 60, 60), List.of(40, 50, 50, 60), List.of(50, 50, 50, 50)), solution.fourSum(nums, target));
	}

	@Test
	void secondAdditionalTest() {
		int[] nums = new int[]{-1000000000,-1000000000,1000000000,-1000000000,-1000000000};
		int target = 294967296;
		assertEquals(List.of(), solution.fourSum(nums, target));
	}
}