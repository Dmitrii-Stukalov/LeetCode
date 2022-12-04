package test;

import code.Solution2256;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2256Test {
    Solution2256 solution = new Solution2256();

    @Test
    void firstTest() {
        int[] nums = new int[]{2, 5, 3, 9, 5, 3};
        assertEquals(3, solution.minimumAverageDifference(nums));
    }

    @Test
    void secondTest() {
        int[] nums = new int[]{0};
        assertEquals(0, solution.minimumAverageDifference(nums));
    }

    @Test
    void firstAdditionalTest() {
        int[] nums = new int[100000];
        nums[0] = 99999;
        assertEquals(99999, solution.minimumAverageDifference(nums));
    }

    @Test
    void secondAdditionalTest() {
        int[] nums = new int[]{0, 0, 0, 0, 0};
        assertEquals(0, solution.minimumAverageDifference(nums));
    }

    @Test
    void thirdAdditionalTest() {
        int n = 100_000;
        int[] nums = new int[n];
        Arrays.fill(nums, 0, n / 2 + 1, 65536);
        Arrays.fill(nums, n / 2 + 1, n, 0);
        assertEquals(0, solution.minimumAverageDifference(nums));
    }

}