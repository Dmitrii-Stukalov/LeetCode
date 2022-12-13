package test;

import code.Solution931;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution931Test {
    Solution931 solution = new Solution931();

    @Test
    void firstTest() {
        int[][] matrix = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        assertEquals(13, solution.minFallingPathSum(matrix));
    }

    @Test
    void secondTest() {
        int[][] matrix = new int[][]{{-19, 57}, {-40, -5}};
        assertEquals(-59, solution.minFallingPathSum(matrix));
    }

    @Test
    void additionalTest() {
        int[][] matrix = new int[][]{{-48}};
        assertEquals(-48, solution.minFallingPathSum(matrix));
    }
}