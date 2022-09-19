package test;

import code.Solution1614;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1614Test {
    Solution1614 solution = new Solution1614();

    @Test
    void firstTest() {
        String s = "(1+(2*3)+((8)/4))+1";
        assertEquals(3, solution.maxDepth(s));
    }

    @Test
    void secondTest() {
        String s = "(1)+((2))+(((3)))";
        assertEquals(3, solution.maxDepth(s));
    }

}