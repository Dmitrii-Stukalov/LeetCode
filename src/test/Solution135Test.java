package test;

import code.Solution135;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution135Test {
    Solution135 solution = new Solution135();

    @Test
    void firstTest() {
        int[] ratings = {1, 0, 2};
        assertEquals(5, solution.candy(ratings));
    }

    @Test
    void secondTest() {
        int[] ratings = {1, 2, 2};
        assertEquals(4, solution.candy(ratings));
    }
}