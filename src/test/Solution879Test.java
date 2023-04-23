package test;

import code.Solution879;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution879Test {
    Solution879 solution = new Solution879();

    @Test
    void firstTest() {
        int n = 5;
        int minProfit = 3;
        int[] group = {2, 2};
        int[] profit = {2, 3};
        assertEquals(2, solution.profitableSchemes(n, minProfit, group, profit));
    }

    @Test
    void secondTest() {
        int n = 10;
        int minProfit = 5;
        int[] group = {2, 3, 5};
        int[] profit = {6, 7, 8};
        assertEquals(7, solution.profitableSchemes(n, minProfit, group, profit));
    }
}