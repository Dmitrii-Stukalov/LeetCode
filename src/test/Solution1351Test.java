package test;

import code.Solution1351;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1351Test {
    Solution1351 solution = new Solution1351();

    @Test
    void firstTest() {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}};
        assertEquals(8, solution.countNegatives(grid));
    }

    @Test
    void secondTest() {
        int[][] grid = {
                {3, 2},
                {1, 0}};
        assertEquals(0, solution.countNegatives(grid));
    }

    @Test
    void additionalTest() {
        int[][] grid = {{7, -3}};
        assertEquals(1, solution.countNegatives(grid));
    }
}