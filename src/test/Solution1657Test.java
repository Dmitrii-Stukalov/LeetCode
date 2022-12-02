package test;

import code.Solution1657;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1657Test {
    Solution1657 solution = new Solution1657();

    @Test
    void firstTest() {
        String word1 = "abc";
        String word2 = "bca";
        assertTrue(solution.closeStrings(word1, word2));
    }

    @Test
    void secondTest() {
        String word1 = "a";
        String word2 = "aa";
        assertFalse(solution.closeStrings(word1, word2));
    }

    @Test
    void thirdTest() {
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertTrue(solution.closeStrings(word1, word2));
    }

    @Test
    void firstAdditionalTest() {
        String word1 = "cabbba";
        String word2 = "aabbss";
        assertFalse(solution.closeStrings(word1, word2));
    }

    @Test
    void secondAdditionalTest() {
        String word1 = "uau";
        String word2 = "ssx";
        assertFalse(solution.closeStrings(word1, word2));
    }

    @Test
    void thirdAdditionalTest() {
        String word1 = "abbzccca";
        String word2 = "babzzczc";
        assertTrue(solution.closeStrings(word1, word2));
    }

    @Test
    void fourthAdditionalTest() {
        String word1 = "abbzzca";
        String word2 = "babzzcz";
        assertFalse(solution.closeStrings(word1, word2));
    }
}