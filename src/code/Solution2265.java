package code;

import java.util.Objects;

public class Solution2265 {
	public int averageOfSubtree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int count = subtreeSum(root) / subtreeSize(root) == root.val ? 1 : 0;
		if (root.left != null) {
			count += averageOfSubtree(root.left);
		}
		if (root.right != null) {
			count += averageOfSubtree(root.right);
		}
		return count;
	}

	private int subtreeSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int sum = root.val;
		if (root.left != null) {
			sum += subtreeSum(root.left);
		}
		if (root.right != null) {
			sum += subtreeSum(root.right);
		}
		return sum;
	}

	private int subtreeSize(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int size = 1;
		if (root.left != null) {
			size += subtreeSize(root.left);
		}
		if (root.right != null) {
			size += subtreeSize(root.right);
		}
		return size;
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
