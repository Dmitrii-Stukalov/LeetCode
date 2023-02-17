package test;

import code.Solution530;
import code.Solution530.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution530Test {
	Solution530 solution = new Solution530();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
				new TreeNode(6));
		assertEquals(1, solution.getMinimumDifference(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12),
				new TreeNode(49)));
		assertEquals(1, solution.getMinimumDifference(root));
	}
}