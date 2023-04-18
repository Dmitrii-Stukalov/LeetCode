package test;

import code.Solution1706;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1706Test {
    Solution1706 solution = new Solution1706();

    @Test
    void firstTest() {
        int[][] grid = {
                {1, 1, 1, -1, -1},
                {1, 1, 1, -1, -1},
                {-1, -1, -1, 1, 1},
                {1, 1, 1, 1, -1},
                {-1, -1, -1, -1, -1}};
        assertArrayEquals(new int[]{1, -1, -1, -1, -1}, solution.findBall(grid));
    }

    @Test
    void secondTest() {
        int[][] grid = {{-1}};
        assertArrayEquals(new int[]{-1}, solution.findBall(grid));
    }

    @Test
    void thirdTest() {
        int[][] grid = {
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1},
                {1, 1, 1, 1, 1, 1},
                {-1, -1, -1, -1, -1, -1}};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, -1}, solution.findBall(grid));
    }
}