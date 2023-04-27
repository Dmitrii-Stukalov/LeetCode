package test;

import code.Solution319;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution319Test {
    Solution319 solution = new Solution319();

    @Test
    void firstTest() {
        int n = 3;
        assertEquals(1, solution.bulbSwitch(n));
    }

    @Test
    void secondTest() {
        int n = 0;
        assertEquals(0, solution.bulbSwitch(n));
    }

    @Test
    void thirdTest() {
        int n = 1;
        assertEquals(1, solution.bulbSwitch(n));
    }

    @Test
    void timeLimitTest() {
        int n = 99999999;
        assertEquals(9999, solution.bulbSwitch(n));
    }
}