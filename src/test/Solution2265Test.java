package test;

import code.Solution2265;
import code.Solution2265.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution2265Test {
	Solution2265 solution = new Solution2265();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(4, new TreeNode(8, new TreeNode(0), new TreeNode(1)),
				new TreeNode(5, null, new TreeNode(6)));
		assertEquals(5, solution.averageOfSubtree(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(1);
		assertEquals(1, solution.averageOfSubtree(root));
	}
}