package test;

import code.Solution103;
import code.Solution103.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution103Test {
	Solution103 solution = new Solution103();

	@Test
	void firstTest() {
		TreeNode root = new TreeNode(3, new TreeNode(9),
				new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		assertEquals(List.of(List.of(3), List.of(20, 9), List.of(15, 7)), solution.zigzagLevelOrder(root));
	}

	@Test
	void secondTest() {
		TreeNode root = new TreeNode(1);
		assertEquals(List.of(List.of(1)), solution.zigzagLevelOrder(root));
	}

	@Test
	void thirdTest() {
		TreeNode root = new TreeNode();
		assertEquals(List.of(List.of(0)), solution.zigzagLevelOrder(root));
	}
}