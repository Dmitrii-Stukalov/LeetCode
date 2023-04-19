package test;

import code.Solution118;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution118Test {
    Solution118 solution = new Solution118();

    @Test
    void firstTest() {
        int numRows = 5;
        assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)),
                solution.generate(numRows));
    }

    @Test
    void secondTest() {
        int numRows = 1;
        assertEquals(List.of(List.of(1)), solution.generate(numRows));
    }
}