package test;

import code.Solution1647;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1647Test {
    Solution1647 solution = new Solution1647();

    @Test
    void firstTest() {
        String s = "aab";
        assertEquals(0, solution.minDeletions(s));
    }

    @Test
    void secondTest() {
        String s = "aaabbbcc";
        assertEquals(2, solution.minDeletions(s));
    }

    @Test
    void thirdTest() {
        String s = "ceabaacb";
        assertEquals(2, solution.minDeletions(s));
    }
}