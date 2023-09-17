package test;

import code.Solution62;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution62Test {
    Solution62 solution = new Solution62();

    @Test
    void firstTest() {
        int m = 3, n = 7;
        assertEquals(28, solution.uniquePaths(m, n));
    }

    @Test
    void secondTest() {
        int m = 3, n = 2;
        assertEquals(3, solution.uniquePaths(m, n));
    }
}