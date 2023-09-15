package test;

import code.Solution30;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution30Test {
    Solution30 solution = new Solution30();

    @Test
    void firstTest() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        assertEquals(List.of(0, 9), solution.findSubstring(s, words));
    }

    @Test
    void secondTest() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        assertEquals(List.of(), solution.findSubstring(s, words));
    }

    @Test
    void thirdTest() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        assertEquals(List.of(6, 9, 12), solution.findSubstring(s, words));
    }
}