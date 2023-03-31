package test;

import code.Solution1315;
import code.Solution1315.TreeNode;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Solution1315Test {
	Solution1315 solution = new Solution1315();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(6, new TreeNode(7, new TreeNode(2, new TreeNode(9), null),
				new TreeNode(7, new TreeNode(1), new TreeNode(4))), new TreeNode(8, new TreeNode(1),
				new TreeNode(3, null, new TreeNode(5))));
		assertEquals(18, solution.sumEvenGrandparent(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(1);
		assertEquals(0, solution.sumEvenGrandparent(root));
	}
}