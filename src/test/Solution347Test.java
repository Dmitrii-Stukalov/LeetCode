package test;

import code.Solution347;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution347Test {
    Solution347 solution = new Solution347();

    @Test
    void firstTest() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(nums, k));
    }

    @Test
    void secondTest() {
        int[] nums = {1};
        int k = 1;
        assertArrayEquals(new int[]{1}, solution.topKFrequent(nums, k));
    }
}