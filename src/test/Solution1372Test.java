package test;

import code.Solution1372;
import code.Solution1372.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1372Test {
    Solution1372 solution = new Solution1372();

    @Test
    void firstTest() {
        TreeNode root = new TreeNode(1, null, new TreeNode(1, new TreeNode(1),
                new TreeNode(1, new TreeNode(1, null, new TreeNode(1, null,
                        new TreeNode(1))), new TreeNode(1))));
        assertEquals(3, solution.longestZigZag(root));
    }

    @Test
    void secondTest() {
        TreeNode root = new TreeNode(1, new TreeNode(1, null, new TreeNode(1,
                new TreeNode(1, null, new TreeNode(1)), new TreeNode(1))), new TreeNode(1));
        assertEquals(4, solution.longestZigZag(root));
    }

    @Test
    void thirdTest() {
        TreeNode root = new TreeNode(1);
        assertEquals(0, solution.longestZigZag(root));
    }
}