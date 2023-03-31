package code;

import java.util.Objects;

public class Solution1315 {
	public int sumEvenGrandparent(TreeNode root) {
		int sum = 0;
		if (root == null) {
			return 0;
		}
		if (root.left != null) {
			if (root.val % 2 == 0 && root.left.left != null) {
				sum += root.left.left.val;
			}
			if (root.val % 2 == 0 && root.left.right != null) {
				sum += root.left.right.val;
			}
			sum += sumEvenGrandparent(root.left);
		}
		if (root.right != null) {
			if (root.val % 2 == 0 && root.right.left != null) {
				sum += root.right.left.val;
			}
			if (root.val % 2 == 0 && root.right.right != null) {
				sum += root.right.right.val;
			}
			sum += sumEvenGrandparent(root.right);
		}

		return sum;
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
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
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
