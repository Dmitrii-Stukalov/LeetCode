package test;

import code.Solution2652;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2652Test {
    Solution2652 solution = new Solution2652();

    @Test
    void firstTest() {
        int n = 7;
        assertEquals(21, solution.sumOfMultiples(n));
    }

    @Test
    void secondTest() {
        int n = 10;
        assertEquals(40, solution.sumOfMultiples(n));
    }

    @Test
    void thirdTest() {
        int n = 9;
        assertEquals(30, solution.sumOfMultiples(n));
    }

    @Test
    void additionalTest() {
        int n = 15;
        assertEquals(81, solution.sumOfMultiples(n));
    }
}