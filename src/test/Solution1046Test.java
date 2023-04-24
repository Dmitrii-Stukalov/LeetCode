package test;

import code.Solution1046;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1046Test {
    Solution1046 solution = new Solution1046();

    @Test
    void firstTest() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        assertEquals(1, solution.lastStoneWeight(stones));
    }

    @Test
    void secondTest() {
        int[] stones = {1};
        assertEquals(1, solution.lastStoneWeight(stones));
    }
}