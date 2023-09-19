package test;

import code.Solution287;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution287Test {
    Solution287 solution = new Solution287();

    @Test
    void firstTest() {
        int[] nums = {1, 3, 4, 2, 2};
        assertEquals(2, solution.findDuplicate(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {3, 1, 3, 4, 2};
        assertEquals(3, solution.findDuplicate(nums));
    }
}