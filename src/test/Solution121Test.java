package test;

import code.Solution121;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution121Test {
    Solution121 solution = new Solution121();

    @Test
    void firstTest() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    void secondTest() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }
}