package test;

import code.Solution1302;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1302Test {
	Solution1302 solution = new Solution1302();

	@Test
	void firstTest() {
		Solution1302.TreeNode root = new Solution1302.TreeNode(1, new Solution1302.TreeNode(2, new Solution1302.TreeNode(4, new Solution1302.TreeNode(7), null), new Solution1302.TreeNode(5)), new Solution1302.TreeNode(3, null, new Solution1302.TreeNode(6, null, new Solution1302.TreeNode(8))));
		assertEquals(15, solution.deepestLeavesSum(root));
	}

	@Test
	void secondTest() {
		Solution1302.TreeNode root = new Solution1302.TreeNode(6, new Solution1302.TreeNode(7, new Solution1302.TreeNode(2, new Solution1302.TreeNode(9), null), new Solution1302.TreeNode(7, new Solution1302.TreeNode(1), new Solution1302.TreeNode(4))), new Solution1302.TreeNode(8, new Solution1302.TreeNode(1), new Solution1302.TreeNode(3, null, new Solution1302.TreeNode(5))));
		assertEquals(19, solution.deepestLeavesSum(root));
	}

}