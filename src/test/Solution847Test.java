package test;

import code.Solution847;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution847Test {
    Solution847 solution = new Solution847();

    @Test
    void firstTest() {
        int[][] graph = {{1, 2, 3}, {0}, {0}, {0}};
        assertEquals(4, solution.shortestPathLength(graph));
    }

    @Test
    void secondTest() {
        int[][] graph = {{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}};
        assertEquals(4, solution.shortestPathLength(graph));
    }
}