package test;

import code.Solution2236;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2236Test {
	Solution2236 solution = new Solution2236();

	@Test
	void firstTest() {
		Solution2236.TreeNode treeNode = new Solution2236.TreeNode(10, new Solution2236.TreeNode(4), new Solution2236.TreeNode(6));
		assertTrue(solution.checkTree(treeNode));
	}

	@Test
	void secondTest() {
		Solution2236.TreeNode treeNode = new Solution2236.TreeNode(5, new Solution2236.TreeNode(3), new Solution2236.TreeNode(1));
		assertFalse(solution.checkTree(treeNode));
	}
}