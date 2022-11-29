package test;

import code.Solution3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution3Test {
    Solution3 solution = new Solution3();

    @Test
    void firstTest() {
        String s = "abcabcbb";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void secondTest() {
        String s = "bbbbb";
        assertEquals(1, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void thirdTest() {
        String s = "pwwkew";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void firstAdditionalTest() {
        String s = "qrsvbspk";
        assertEquals(5, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void secondAdditionalTest() {
        String s = "dvdf";
        assertEquals(3, solution.lengthOfLongestSubstring(s));
    }

    @Test
    void thirdAdditionalTest() {
        String s = "bbtablud";
        assertEquals(6, solution.lengthOfLongestSubstring(s));
    }
}