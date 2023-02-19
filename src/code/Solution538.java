package code;

import java.util.Objects;

public class Solution538 {
	private int pre = 0;

	public TreeNode convertBST(TreeNode root) {
		if (root == null) {
			return root;
		}
		if (root.right != null) {
			convertBST(root.right);
		}
		pre += root.val;
		root.val = pre;
		if (root.left != null) {
			convertBST(root.left);
		}
		return root;
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
