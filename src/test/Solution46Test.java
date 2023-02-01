package test;

import code.Solution46;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution46Test {
    Solution46 solution = new Solution46();

    @Test
    void firstTest() {
        int[] nums = {1, 1, 2};
        int[] expected = {1, 2};
        testSolution(expected, nums);
    }

    @Test
    void secondTest() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expected = {0, 1, 2, 3, 4};
        testSolution(expected, nums);
    }

    private void testSolution(int[] expected, int[] nums) {
        int k = solution.removeDuplicates(nums);
        assertEquals(expected.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }
}