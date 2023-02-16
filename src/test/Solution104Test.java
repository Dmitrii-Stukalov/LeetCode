package test;

import code.Solution104;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution104Test {
	Solution104 solution = new Solution104();

	@Test
	void firstTest() {
		Solution104.TreeNode root = new Solution104.TreeNode(3, new Solution104.TreeNode(9),
				new Solution104.TreeNode(20, new Solution104.TreeNode(15), new Solution104.TreeNode(7)));
		assertEquals(3, solution.maxDepth(root));
	}

	@Test
	void secondTest() {
		Solution104.TreeNode root = new Solution104.TreeNode(1, null, new Solution104.TreeNode(2));
		assertEquals(2, solution.maxDepth(root));
	}

}