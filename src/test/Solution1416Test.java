package test;

import code.Solution1416;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1416Test {
    Solution1416 solution = new Solution1416();

    @Test
    void firstTest() {
        String s = "1000";
        int k = 10000;
        assertEquals(1, solution.numberOfArrays(s, k));
    }

    @Test
    void secondTest() {
        String s = "1000";
        int k = 10;
        assertEquals(0, solution.numberOfArrays(s, k));
    }

    @Test
    void thirdTest() {
        String s = "1317";
        int k = 2000;
        assertEquals(8, solution.numberOfArrays(s, k));
    }
}