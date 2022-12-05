package test;

import code.Solution2469;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution2469Test {
    Solution2469 solution = new Solution2469();

    @Test
    void firstTest() {
        double celsius = 36.50;
        assertArrayEquals(new double[]{309.65000, 97.70000}, solution.convertTemperature(celsius));
    }

    @Test
    void secondTest() {
        double celsius = 122.11;
        assertArrayEquals(new double[]{395.26000, 251.79800}, solution.convertTemperature(celsius));
    }
}