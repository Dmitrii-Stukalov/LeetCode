package test;

import code.Solution124;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution124Test {
    Solution124 solution = new Solution124();

    @Test
    void firstTest() {
        Solution124.TreeNode root = new Solution124.TreeNode(1, new Solution124.TreeNode(2),
                new Solution124.TreeNode(3));
        assertEquals(6, solution.maxPathSum(root));
    }

    @Test
    void secondTest() {
        Solution124.TreeNode root = new Solution124.TreeNode(-10, new Solution124.TreeNode(9),
                new Solution124.TreeNode(20, new Solution124.TreeNode(15), new Solution124.TreeNode(7)));
        assertEquals(42, solution.maxPathSum(root));
    }
}