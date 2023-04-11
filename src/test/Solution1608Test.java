package test;

import code.Solution1608;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1608Test {
    Solution1608 solution = new Solution1608();

    @Test
    void firstTest() {
        int[] nums = {3, 5};
        assertEquals(2, solution.specialArray(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {0, 0};
        assertEquals(-1, solution.specialArray(nums));
    }

    @Test
    void thirdTest() {
        int[] nums = {0, 4, 3, 0, 4};
        assertEquals(3, solution.specialArray(nums));
    }
}