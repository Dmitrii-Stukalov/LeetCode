package test;

import code.Solution69;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution69Test {
    Solution69 solution = new Solution69();

    @Test
    void firstTest() {
        int x = 4;
        assertEquals(2, solution.mySqrt(x));
    }

    @Test
    void secondTest() {
        int x = 8;
        assertEquals(2, solution.mySqrt(x));
    }
}