package test;

import code.Solution1584;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1584Test {
    Solution1584 solution = new Solution1584();

    @Test
    void firstTest() {
        int[][] points = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        assertEquals(20, solution.minCostConnectPoints(points));
    }

    @Test
    void secondTest() {
        int[][] points = {{3, 12}, {-2, 5}, {-4, 1}};
        assertEquals(18, solution.minCostConnectPoints(points));
    }
}