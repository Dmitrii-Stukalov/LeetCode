package test;

import code.Solution94;
import code.Solution94.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution94Test {
    Solution94 solution = new Solution94();

    @Test
    void firstTest() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertEquals(List.of(1, 3, 2), solution.inorderTraversal(root));
    }

    @Test
    void secondTest() {
        TreeNode root = new TreeNode();
        assertEquals(List.of(0), solution.inorderTraversal(root));
    }

    @Test
    void thirdTest() {
        TreeNode root = new TreeNode(1);
        assertEquals(List.of(1), solution.inorderTraversal(root));
    }
}