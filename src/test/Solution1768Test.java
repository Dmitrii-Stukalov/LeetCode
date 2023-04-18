package test;

import code.Solution1768;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1768Test {
    Solution1768 solution = new Solution1768();

    @Test
    void firstTest() {
        String word1 = "abc", word2 = "pqr";
        assertEquals("apbqcr", solution.mergeAlternately(word1, word2));
    }

    @Test
    void secondTest() {
        String word1 = "ab", word2 = "pqrs";
        assertEquals("apbqrs", solution.mergeAlternately(word1, word2));
    }

    @Test
    void thirdTest() {
        String word1 = "abcd", word2 = "pq";
        assertEquals("apbqcd", solution.mergeAlternately(word1, word2));
    }
}