package test;

import code.Solution239;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution239Test {
    Solution239 solution = new Solution239();

    @Test
    void firstTest() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(nums, k));
    }

    @Test
    void secondTest() {
        int[] nums = {1};
        int k = 1;
        assertArrayEquals(new int[]{1}, solution.maxSlidingWindow(nums, k));
    }
}