package test;

import code.Solution645;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution645Test {
    Solution645 solution = new Solution645();

    @Test
    void firstTest() {
        int[] nums = {1,2,2,4};
        assertArrayEquals(new int[]{2, 3}, solution.findErrorNums(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {1,1};
        assertArrayEquals(new int[]{1, 2}, solution.findErrorNums(nums));
    }

}