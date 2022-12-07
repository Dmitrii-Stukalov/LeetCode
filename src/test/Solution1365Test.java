package test;

import code.Solution1365;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1365Test {
    Solution1365 solution = new Solution1365();

    @Test
    void firstTest() {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    void secondTest() {
        int[] nums = new int[]{6, 5, 4, 8};
        assertArrayEquals(new int[]{2, 1, 0, 3}, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    void thirdTest() {
        int[] nums = new int[]{7, 7, 7, 7};
        assertArrayEquals(new int[]{0, 0, 0, 0}, solution.smallerNumbersThanCurrent(nums));
    }
}