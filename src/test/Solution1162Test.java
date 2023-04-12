package test;

import code.Solution1162;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1162Test {
    Solution1162 solution = new Solution1162();

    @Test
    void firstTest() {
        int[][] grid = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}};
        assertEquals(2, solution.maxDistance(grid));
    }

    @Test
    void secondTest() {
        int[][] grid = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        assertEquals(4, solution.maxDistance(grid));
    }
}