package test;

import code.Solution654;
import code.Solution654.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution654Test {
    Solution654 solution = new Solution654();

    @Test
    void firstTest() {
        int[] nums = {3, 2, 1, 6, 0, 5};
        TreeNode expected = new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null,
                new TreeNode(1))), new TreeNode(5, new TreeNode(0), null));
        assertEquals(expected, solution.constructMaximumBinaryTree(nums));
    }

    @Test
    void secondTest() {
        int[] nums = {3, 2, 1};
        TreeNode expected = new TreeNode(3, null, new TreeNode(2, null, new TreeNode(1)));
        assertEquals(expected, solution.constructMaximumBinaryTree(nums));
    }
}