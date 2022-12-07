package test;

import code.Solution938;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution938Test {
    Solution938 solution = new Solution938();

    @Test
    public void firstTest() {
        Solution938.TreeNode root = new Solution938.TreeNode(10, new Solution938.TreeNode(5,
                new Solution938.TreeNode(3), new Solution938.TreeNode(7)), new Solution938.TreeNode(15,
                null, new Solution938.TreeNode(18)));
        int low = 7, high = 15;
        assertEquals(32, solution.rangeSumBST(root, low, high));
    }

    @Test
    public void secondTest() {
        Solution938.TreeNode root = new Solution938.TreeNode(10, new Solution938.TreeNode(5,
                new Solution938.TreeNode(3, new Solution938.TreeNode(1), null),
                new Solution938.TreeNode(7, new Solution938.TreeNode(6), null)),
                new Solution938.TreeNode(15, new Solution938.TreeNode(13), new Solution938.TreeNode(18)));
        int low = 6, high = 10;
        assertEquals(23, solution.rangeSumBST(root, low, high));
    }

}