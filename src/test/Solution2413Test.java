package test;

import code.Solution2413;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2413Test {
    Solution2413 solution = new Solution2413();

    @Test
    void firstTest() {
        int n = 5;
        assertEquals(10, solution.smallestEvenMultiple(n));
    }

    @Test
    void secondTest() {
        int n = 6;
        assertEquals(6, solution.smallestEvenMultiple(n));
    }
}