package test;

import code.Solution2225;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2225Test {
    Solution2225 solution = new Solution2225();

    @Test
    void firstTest() {
        int[][] matches = new int[][]{new int[]{1, 3}, new int[]{2, 3}, new int[]{3, 6}, new int[]{5, 6}, new int[]{5, 7},
                new int[]{4, 5}, new int[]{4, 8}, new int[]{4, 9}, new int[]{10, 4}, new int[]{10, 9}};
        assertEquals(List.of(List.of(1, 2, 10), List.of(4, 5, 7, 8)), solution.findWinners(matches));
    }

    @Test
    void secondTest() {
        int[][] matches = new int[][]{new int[]{2, 3}, new int[]{1, 3}, new int[]{5, 4}, new int[]{6, 4}};
        assertEquals(List.of(List.of(1, 2, 5, 6), Collections.EMPTY_LIST), solution.findWinners(matches));
    }

    @Test
    void thirdTest() {
        int[][] matches = new int[][]{new int[]{1, 5}, new int[]{1, 10}, new int[]{1, 11}, new int[]{2, 11},
                new int[]{2, 13}, new int[]{2, 14}, new int[]{3, 4}, new int[]{3, 8}, new int[]{4, 12}, new int[]{4, 15},
                new int[]{5, 6}, new int[]{5, 10}, new int[]{5, 13}, new int[]{5, 19}, new int[]{6, 9}, new int[]{6, 10},
                new int[]{6, 13}, new int[]{6, 14}, new int[]{6, 18}, new int[]{7, 10}, new int[]{7, 11}, new int[]{7, 12},
                new int[]{7, 14}, new int[]{8, 10}, new int[]{8, 11}, new int[]{8, 14}, new int[]{9, 11}, new int[]{9, 12},
                new int[]{9, 13}, new int[]{9, 16}, new int[]{9, 19}, new int[]{10, 17}, new int[]{11, 13}, new int[]{11, 17},
                new int[]{12, 15}, new int[]{16, 17}, new int[]{16, 18}};
        assertEquals(List.of(List.of(1, 2, 3, 7), List.of(4, 5, 6, 8, 9, 16)), solution.findWinners(matches));
    }
}