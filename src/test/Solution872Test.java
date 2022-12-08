package test;

import code.Solution872;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution872Test {
    Solution872 solution = new Solution872();

    @Test
    void firstTest() {
        Solution872.TreeNode root1 = new Solution872.TreeNode(3, new Solution872.TreeNode(5,
                new Solution872.TreeNode(6), new Solution872.TreeNode(2, new Solution872.TreeNode(7),
                new Solution872.TreeNode(4))), new Solution872.TreeNode(1, new Solution872.TreeNode(9),
                new Solution872.TreeNode(8)));
        Solution872.TreeNode root2 = new Solution872.TreeNode(3, new Solution872.TreeNode(5,
                new Solution872.TreeNode(6), new Solution872.TreeNode(7)), new Solution872.TreeNode(1,
                new Solution872.TreeNode(4), new Solution872.TreeNode(2, new Solution872.TreeNode(9),
                new Solution872.TreeNode(8))));
        assertTrue(solution.leafSimilar(root1, root2));
    }

    @Test
    void secondTest() {
        Solution872.TreeNode root1 = new Solution872.TreeNode(1, new Solution872.TreeNode(2), new Solution872.TreeNode(3));
        Solution872.TreeNode root2 = new Solution872.TreeNode(1, new Solution872.TreeNode(3), new Solution872.TreeNode(2));
        assertFalse(solution.leafSimilar(root1, root2));
    }

}