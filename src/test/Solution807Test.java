package test;

import code.Solution807;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution807Test {
    Solution807 solution = new Solution807();

    @Test
    void firstTest() {
        int[][] grid = new int[][]{new int[]{3, 0, 8, 4}, new int[]{2, 4, 5, 7}, new int[]{9, 2, 6, 3}, new int[]{0, 3, 1, 0}};
        assertEquals(35, solution.maxIncreaseKeepingSkyline(grid));
    }

    @Test
    void secondTest() {
        int[][] grid = new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}};
        assertEquals(0, solution.maxIncreaseKeepingSkyline(grid));
    }
}