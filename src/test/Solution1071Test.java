package test;

import code.Solution1071;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1071Test {
    Solution1071 solution = new Solution1071();

    @Test
    void firstTest() {
        String str1 = "ABCABC", str2 = "ABC";
        assertEquals("ABC", solution.gcdOfStrings(str1, str2));
    }

    @Test
    void secondTest() {
        String str1 = "ABABAB", str2 = "ABAB";
        assertEquals("AB", solution.gcdOfStrings(str1, str2));
    }

    @Test
    void thirdTest() {
        String str1 = "LEET", str2 = "CODE";
        assertEquals("", solution.gcdOfStrings(str1, str2));
    }

    @Test
    void additionalTest() {
        String str1 = "ABCDEF", str2 = "ABC";
        assertEquals("", solution.gcdOfStrings(str1, str2));
    }
}