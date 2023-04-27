package test;

import code.Solution258;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution258Test {
    Solution258 solution = new Solution258();

    @Test
    void firstTest() {
        int num = 38;
        assertEquals(2, solution.addDigits(num));
    }

    @Test
    void secondTest() {
        int num = 0;
        assertEquals(0, solution.addDigits(num));
    }
}