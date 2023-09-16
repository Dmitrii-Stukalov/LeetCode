package test;

import code.Solution338;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution338Test {
    Solution338 solution = new Solution338();

    @Test
    void firstTest() {
        int n = 2;
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(n));
    }

    @Test
    void secondTest() {
        int n = 5;
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(n));
    }
}