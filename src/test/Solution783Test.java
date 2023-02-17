package test;

import code.Solution783;
import code.Solution783.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution783Test {
	Solution783 solution = new Solution783();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
				new TreeNode(6));
		assertEquals(1, solution.minDiffInBST(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(1, new TreeNode(0), new TreeNode(48, new TreeNode(12),
				new TreeNode(49)));
		assertEquals(1, solution.minDiffInBST(root));
	}

	@Test
	void firstAdditionalTest() {
		TreeNode root = new TreeNode(27, null, new TreeNode(34, null, new TreeNode(58,
				new TreeNode(50, new TreeNode(44), null), null)));
		assertEquals(6, solution.minDiffInBST(root));
	}

	@Test
	void secondAdditionalTest() {
		TreeNode root = new TreeNode(90, new TreeNode(69, new TreeNode(49, null, new TreeNode(52)),
				new TreeNode(89)), null);
		assertEquals(1, solution.minDiffInBST(root));
	}
}