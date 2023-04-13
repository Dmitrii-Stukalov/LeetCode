package test;

import code.Solution2610;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2610Test {
    Solution2610 solution = new Solution2610();

    @Test
    void firstTest() {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        assertEquals(List.of(List.of(1, 3, 4, 2), List.of(1, 3), List.of(1)), solution.findMatrix(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {1, 2, 3, 4};
        assertEquals(List.of(List.of(1, 2, 3, 4)), solution.findMatrix(nums));
    }
}