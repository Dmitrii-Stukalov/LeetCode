package test;

import code.Solution1704;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1704Test {
    Solution1704 solution = new Solution1704();

    @Test
    void firstTest() {
        String s = "book";
        assertTrue(solution.halvesAreAlike(s));
    }

    @Test
    void secondTest() {
        String s = "textbook";
        assertFalse(solution.halvesAreAlike(s));
    }
}