package test;

import code.Solution42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution42Test {
    Solution42 solution = new Solution42();

    @Test
    void firstTest() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, solution.trap(height));
    }

    @Test
    void secondTest() {
        int[] height = {4, 2, 0, 3, 2, 5};
        assertEquals(9, solution.trap(height));
    }
}