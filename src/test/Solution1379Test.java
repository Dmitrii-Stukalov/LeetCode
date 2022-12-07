package test;

import code.Solution1379;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1379Test {
    Solution1379 solution = new Solution1379();

    @Test
    void firstTest() {
        Solution1379.TreeNode tree = new Solution1379.TreeNode(7, new Solution1379.TreeNode(4),
                new Solution1379.TreeNode(3, new Solution1379.TreeNode(6), new Solution1379.TreeNode(19)));
        Solution1379.TreeNode cloned = new Solution1379.TreeNode(7, new Solution1379.TreeNode(4),
                new Solution1379.TreeNode(3, new Solution1379.TreeNode(6), new Solution1379.TreeNode(19)));
        Solution1379.TreeNode target = new Solution1379.TreeNode(3);
        Solution1379.TreeNode expected = new Solution1379.TreeNode(3, new Solution1379.TreeNode(6),
                new Solution1379.TreeNode(19));
        assertEquals(expected, solution.getTargetCopy(tree, cloned, target));
    }

    @Test
    void secondTest() {
        Solution1379.TreeNode tree = new Solution1379.TreeNode(7);
        Solution1379.TreeNode cloned = new Solution1379.TreeNode(7);
        Solution1379.TreeNode target = new Solution1379.TreeNode(7);
        Solution1379.TreeNode expected = new Solution1379.TreeNode(7);
        assertEquals(expected, solution.getTargetCopy(tree, cloned, target));
    }

    @Test
    void thirdTest() {
        Solution1379.TreeNode tree = new Solution1379.TreeNode(8, null, new Solution1379.TreeNode(6,
                null, new Solution1379.TreeNode(5, null, new Solution1379.TreeNode(4, null,
                new Solution1379.TreeNode(3, null, new Solution1379.TreeNode(2, null,
                        new Solution1379.TreeNode(1)))))));
        Solution1379.TreeNode cloned = new Solution1379.TreeNode(8, null, new Solution1379.TreeNode(6,
                null, new Solution1379.TreeNode(5, null, new Solution1379.TreeNode(4, null,
                new Solution1379.TreeNode(3, null, new Solution1379.TreeNode(2, null,
                        new Solution1379.TreeNode(1)))))));
        Solution1379.TreeNode target = new Solution1379.TreeNode(4);
        Solution1379.TreeNode expected = new Solution1379.TreeNode(4, null, new Solution1379.TreeNode(3,
                null, new Solution1379.TreeNode(2, null, new Solution1379.TreeNode(1))));
        assertEquals(expected, solution.getTargetCopy(tree, cloned, target));
    }

}