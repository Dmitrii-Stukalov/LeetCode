package test;

import code.Solution409;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution409Test {
    Solution409 solution = new Solution409();

    @Test
    void firstTest() {
        String s = "abccccdd";
        assertEquals(7, solution.longestPalindrome(s));
    }

    @Test
    void secondTest() {
        String s = "a";
        assertEquals(1, solution.longestPalindrome(s));
    }

    @Test
    void additionalTest() {
        String s = "ccc";
        assertEquals(3, solution.longestPalindrome(s));
    }
}