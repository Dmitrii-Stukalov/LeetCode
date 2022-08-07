package test;

import code.Solution226;
import org.junit.jupiter.api.Test;

import static code.Solution226.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution226Test {
	Solution226 solution = new Solution226();

	@Test
	void firstTest() {
		TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
		assertEquals(new TreeNode(4, new TreeNode(7, new TreeNode(9), new TreeNode(6)), new TreeNode(2, new TreeNode(3), new TreeNode(1))), solution.invertTree(treeNode));
	}

	@Test
	void secondTest() {
		TreeNode treeNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		assertEquals(new TreeNode(2, new TreeNode(3), new TreeNode(1)), solution.invertTree(treeNode));
	}

	@Test
	void thirdTest() {
		TreeNode treeNode = new TreeNode();
		assertEquals(new TreeNode(), solution.invertTree(treeNode));
	}
}