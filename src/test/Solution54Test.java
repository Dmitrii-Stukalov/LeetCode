package test;

import code.Solution54;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution54Test {
    Solution54 solution = new Solution54();

    @Test
    void firstTest() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        assertEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5), solution.spiralOrder(matrix));
    }

    @Test
    void secondTest() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        assertEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), solution.spiralOrder(matrix));
    }
}