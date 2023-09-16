package test;

import code.Solution1763;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1763Test {
    Solution1763 solution = new Solution1763();

    @Test
    void firstTest() {
        String s = "YazaAay";
        assertEquals("aAa", solution.longestNiceSubstring(s));
    }

    @Test
    void secondTest() {
        String s = "Bb";
        assertEquals("Bb", solution.longestNiceSubstring(s));
    }

    @Test
    void thirdTest() {
        String s = "c";
        assertEquals("", solution.longestNiceSubstring(s));
    }

    @Test
    void firstAdditionalTest() {
        String s = "jcJ";
        assertEquals("", solution.longestNiceSubstring(s));
    }

    @Test
    void secondAdditionalTest() {
        String s = "cChH";
        assertEquals("cChH", solution.longestNiceSubstring(s));
    }
}