package test;

import code.Solution1486;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1486Test {
    Solution1486 solution = new Solution1486();

    @Test
    void firstTest() {
        int n = 5, start = 0;
        assertEquals(8, solution.xorOperation(n, start));
    }

    @Test
    void secondTest() {
        int n = 4, start = 3;
        assertEquals(8, solution.xorOperation(n, start));
    }
}