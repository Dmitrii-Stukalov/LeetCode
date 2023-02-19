package test;

import code.Solution538;
import code.Solution538.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution538Test {
	Solution538 solution = new Solution538();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(4,
				new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
				new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
		TreeNode expected = new TreeNode(30,
				new TreeNode(36, new TreeNode(36), new TreeNode(35, null, new TreeNode(33))),
				new TreeNode(21, new TreeNode(26), new TreeNode(15, null, new TreeNode(8))));
		assertEquals(expected, solution.convertBST(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(0, null, new TreeNode(1));
		assertEquals(new TreeNode(1, null, new TreeNode(1)), solution.convertBST(root));
	}
}