package test;

import code.Solution1207;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1207Test {
    Solution1207 solution = new Solution1207();

    @Test
    void firstTest() {
        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
        assertTrue(solution.uniqueOccurrences(arr));
    }

    @Test
    void secondTest() {
        int[] arr = new int[]{1, 2};
        assertFalse(solution.uniqueOccurrences(arr));
    }

    @Test
    void thirdTest() {
        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(solution.uniqueOccurrences(arr));
    }
}