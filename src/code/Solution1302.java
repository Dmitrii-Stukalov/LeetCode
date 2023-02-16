package code;

import java.util.Objects;

public class Solution1302 {
	private int maxDepth = 0;
	private int sum = 0;

	public int deepestLeavesSum(TreeNode root) {
		deepestLeavesSumWithDepth(root, 0);
		return sum;
	}

	private void deepestLeavesSumWithDepth(TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		if (depth > maxDepth) {
			maxDepth = depth;
			sum = 0;
		}
		if (depth == maxDepth) {
			sum += root.val;
		}
		deepestLeavesSumWithDepth(root.left, depth + 1);
		deepestLeavesSumWithDepth(root.right, depth + 1);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode() {
		}

		public TreeNode(int val) {
			this.val = val;
		}

		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			TreeNode treeNode = (TreeNode) o;
			return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
		}

		@Override
		public String toString() {
			return "TreeNode{" +
					"val=" + val +
					", left=" + left +
					", right=" + right +
					'}';
		}
	}

}
