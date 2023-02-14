package test;

import code.Solution953;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution953Test {
    Solution953 solution = new Solution953();

    @Test
    void firstTest() {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        assertTrue(solution.isAlienSorted(words, order));
    }

    @Test
    void secondTest() {
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        assertFalse(solution.isAlienSorted(words, order));
    }

    @Test
    void thirdTest() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        assertFalse(solution.isAlienSorted(words, order));
    }
}