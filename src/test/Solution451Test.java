package test;

import code.Solution451;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution451Test {
    Solution451 solution = new Solution451();

    @Test
    void firstTest() {
        String s = "tree";
        assertEquals("eert", solution.frequencySort(s));
    }

    @Test
    void secondTest() {
        String s = "cccaaa";
        assertEquals("aaaccc", solution.frequencySort(s));
    }

    @Test
    void thirdTest() {
        String s = "Aabb";
        assertEquals("bbAa", solution.frequencySort(s));
    }
}