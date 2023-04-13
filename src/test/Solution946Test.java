package test;

import code.Solution946;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution946Test {
    Solution946 solution = new Solution946();

    @Test
    void firstTest() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        assertTrue(solution.validateStackSequences(pushed, popped));
    }

    @Test
    void secondTest() {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 3, 5, 1, 2};
        assertFalse(solution.validateStackSequences(pushed, popped));
    }
}