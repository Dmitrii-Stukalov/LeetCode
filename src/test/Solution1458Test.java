package test;

import code.Solution1458;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1458Test {
    Solution1458 solution = new Solution1458();

    @Test
    void firstTest() {
        int[] nums1 = {2, 1, -2, 5};
        int[] nums2 = {3, 0, -6};
        assertEquals(18, solution.maxDotProduct(nums1, nums2));
    }

    @Test
    void secondTest() {
        int[] nums1 = {3, -2};
        int[] nums2 = {2, -6, 7};
        assertEquals(21, solution.maxDotProduct(nums1, nums2));
    }

    @Test
    void thirdTest() {
        int[] nums1 = {-1, -1};
        int[] nums2 = {1, 1};
        assertEquals(-1, solution.maxDotProduct(nums1, nums2));
    }
}