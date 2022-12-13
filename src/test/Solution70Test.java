package test;

import code.Solution70;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution70Test {
    Solution70 solution = new Solution70();

    @Test
    void firstTest() {
        int n = 2;
        assertEquals(2, solution.climbStairs(n));
    }

    @Test
    void secondTest() {
        int n = 3;
        assertEquals(3, solution.climbStairs(n));
    }

    @Test
    void additionalTest() {
        int n = 4;
        assertEquals(5, solution.climbStairs(n));
    }
}