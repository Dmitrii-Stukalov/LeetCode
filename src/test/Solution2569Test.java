package test;

import code.Solution2569;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2569Test {
	Solution2569 solution = new Solution2569();

	@Test
	void firstTest() {
		int[] nums1 = {1, 0, 1};
		int[] nums2 = {0, 0, 0};
		int[][] queries = {{1, 1, 1}, {2, 1, 0}, {3, 0, 0}};
		assertArrayEquals(new long[]{3}, solution.handleQuery(nums1, nums2, queries));
	}

	@Test
	void secondTest() {
		int[] nums1 = {1};
		int[] nums2 = {5};
		int[][] queries = {{2, 0, 0}, {3, 0, 0}};
		assertArrayEquals(new long[]{5}, solution.handleQuery(nums1, nums2, queries));
	}

}