package test;

import code.Solution67;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution67Test {
    Solution67 solution = new Solution67();

    @Test
    void firstTest() {
        String a = "11", b = "1";
        assertEquals("100", solution.addBinary(a, b));
    }

    @Test
    void secondTest() {
        String a = "1010", b = "1011";
        assertEquals("10101", solution.addBinary(a, b));
    }

    @Test
    void additionalTest() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                solution.addBinary(a, b));
    }
}