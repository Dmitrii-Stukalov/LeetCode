package test;

import code.Solution1312;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1312Test {
    Solution1312 solution = new Solution1312();

    @Test
    void firstTest() {
        String s = "zzazz";
        assertEquals(0, solution.minInsertions(s));
    }

    @Test
    void secondTest() {
        String s = "mbadm";
        assertEquals(2, solution.minInsertions(s));
    }

    @Test
    void thirdTest() {
        String s = "leetcode";
        assertEquals(5, solution.minInsertions(s));
    }
}