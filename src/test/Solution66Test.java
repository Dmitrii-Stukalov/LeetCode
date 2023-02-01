package test;

import code.Solution66;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution66Test {
    Solution66 solution = new Solution66();

    @Test
    void firstTest() {
        int[] digits = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(digits));
    }

    @Test
    void secondTest() {
        int[] digits = {4, 3, 2, 1};
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(digits));
    }

    @Test
    void thirdTest() {
        int[] digits = {9};
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(digits));
    }
}