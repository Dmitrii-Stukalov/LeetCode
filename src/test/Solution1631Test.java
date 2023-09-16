package test;

import code.Solution1631;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1631Test {
    Solution1631 solution = new Solution1631();

    @Test
    void firstTest() {
        int[][] heights = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        assertEquals(2, solution.minimumEffortPath(heights));
    }

    @Test
    void secondTest() {
        int[][] heights = {{1, 2, 3}, {3, 8, 4}, {5, 3, 5}};
        assertEquals(1, solution.minimumEffortPath(heights));
    }

    @Test
    void thirdTest() {
        int[][] heights = {{1, 2, 1, 1, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 2, 1, 2, 1}, {1, 1, 1, 2, 1}};
        assertEquals(0, solution.minimumEffortPath(heights));
    }

}