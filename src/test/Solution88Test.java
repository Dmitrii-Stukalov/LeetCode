package test;

import code.Solution88;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class Solution88Test {
	Solution88 solution = new Solution88();

	@Test
	void firstTest() {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		solution.merge(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
	}

	@Test
	void secondTest() {
		int[] nums1 = {1};
		int m = 1;
		int[] nums2 = {};
		int n = 0;
		solution.merge(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1}, nums1);
	}

	@Test
	void thirdTest() {
		int[] nums1 = {0};
		int m = 0;
		int[] nums2 = {1};
		int n = 1;
		solution.merge(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1}, nums1);
	}
}