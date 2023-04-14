package test;

import code.Solution516;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution516Test {
    Solution516 solution = new Solution516();

    @Test
    void firstTest() {
        String s = "bbbab";
        assertEquals(4, solution.longestPalindromeSubseq(s));
    }

    @Test
    void secondTest() {
        String s = "cbbd";
        assertEquals(2, solution.longestPalindromeSubseq(s));
    }
}