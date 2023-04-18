package test;

import code.Solution202;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution202Test {
    Solution202 solution = new Solution202();

    @Test
    void firstTest() {
        int n = 19;
        assertTrue(solution.isHappy(n));
    }

    @Test
    void secondTest() {
        int n = 2;
        assertFalse(solution.isHappy(n));
    }

    @Test
    void additionalTest() {
        int n = 1111111;
        assertTrue(solution.isHappy(n));
    }
}