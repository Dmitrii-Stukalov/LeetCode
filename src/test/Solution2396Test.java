package test;

import code.Solution2396;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class Solution2396Test {
    Solution2396 solution = new Solution2396();

    @Test
    void firstTest() {
        int n = 9;
        assertFalse(solution.isStrictlyPalindromic(n));
    }

    @Test
    void secondTest() {
        int n = 4;
        assertFalse(solution.isStrictlyPalindromic(n));
    }
}