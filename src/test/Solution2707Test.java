package test;

import code.Solution2707;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2707Test {
    Solution2707 solution = new Solution2707();

    @Test
    void firstTest() {
        String s = "leetscode";
        String[] dictionary = {"leet", "code", "leetcode"};
        assertEquals(1, solution.minExtraChar(s, dictionary));
    }

    @Test
    void secondTest() {
        String s = "sayhelloworld";
        String[] dictionary = {"hello", "world"};
        assertEquals(3, solution.minExtraChar(s, dictionary));
    }
}