package test;

import code.Solution344;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution344Test {
    Solution344 solution = new Solution344();

    @Test
    void firstTest() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    void secondTest() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s);
        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, s);
    }
}