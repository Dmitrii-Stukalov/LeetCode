package test;

import code.Solution968;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution968Test {
	Solution968 solution = new Solution968();

	@Test
	void firstTest() {
		Solution968.TreeNode root = new Solution968.TreeNode(0, new Solution968.TreeNode(0, new Solution968.TreeNode(0), new Solution968.TreeNode(0)), null);
		assertEquals(1, solution.minCameraCover(root));
	}

	@Test
	void secondTest() {
		Solution968.TreeNode root = new Solution968.TreeNode(0, new Solution968.TreeNode(0, new Solution968.TreeNode(0, new Solution968.TreeNode(0, null, new Solution968.TreeNode(0)), null), null), null);
		assertEquals(2, solution.minCameraCover(root));
	}
}