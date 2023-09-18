package test;

import code.Solution2859;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2859Test {
    Solution2859 solution = new Solution2859();

    @Test
    void firstTest() {
        List<Integer> nums = List.of(5, 10, 1, 5, 2);
        int k = 1;
        assertEquals(13, solution.sumIndicesWithKSetBits(nums, k));
    }

    @Test
    void secondTest() {
        List<Integer> nums = List.of(4, 3, 2, 1);
        int k = 2;
        assertEquals(1, solution.sumIndicesWithKSetBits(nums, k));
    }
}