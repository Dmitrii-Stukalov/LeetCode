package test;

import code.Solution1337;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1337Test {
    Solution1337 solution = new Solution1337();

    @Test
    void firstTest() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;
        assertArrayEquals(new int[]{2, 0, 3}, solution.kWeakestRows(mat, k));
    }

    @Test
    void secondTest() {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int k = 2;
        assertArrayEquals(new int[]{0, 2}, solution.kWeakestRows(mat, k));
    }
}