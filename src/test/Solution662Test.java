package test;

import code.Solution662;
import code.Solution662.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution662Test {
    Solution662 solution = new Solution662();

    @Test
    void firstTest() {
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(9)));
        assertEquals(4, solution.widthOfBinaryTree(root));
    }

    @Test
    void secondTest() {
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5, new TreeNode(6), null),
                null), new TreeNode(2, null, new TreeNode(9, new TreeNode(7), null)));
        assertEquals(7, solution.widthOfBinaryTree(root));
    }

    @Test
    void thirdTest() {
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), null), new TreeNode(2));
        assertEquals(2, solution.widthOfBinaryTree(root));
    }
}