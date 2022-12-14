package test;

import code.Solution198;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution198Test {
    Solution198 solution = new Solution198();

    @Test
    void firstTest() {
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, solution.rob(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {2, 7, 9, 3, 1};
        assertEquals(12, solution.rob(nums));
    }

    @Test
    void additionalTest() {
        int[] nums = {2, 1, 1, 2};
        assertEquals(4, solution.rob(nums));
    }
}