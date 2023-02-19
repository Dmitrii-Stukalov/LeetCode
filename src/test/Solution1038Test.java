package test;

import code.Solution1038;
import code.Solution1038.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1038Test {
	Solution1038 solution = new Solution1038();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(4,
				new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3))),
				new TreeNode(6, new TreeNode(5), new TreeNode(7, null, new TreeNode(8))));
		TreeNode expected = new TreeNode(30,
				new TreeNode(36, new TreeNode(36), new TreeNode(35, null, new TreeNode(33))),
				new TreeNode(21, new TreeNode(26), new TreeNode(15, null, new TreeNode(8))));
		assertEquals(expected, solution.bstToGst(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(0, null, new TreeNode(1));
		assertEquals(new TreeNode(1, null, new TreeNode(1)), solution.bstToGst(root));
	}
}