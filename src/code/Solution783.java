package code;

import java.util.Objects;

public class Solution783 {
	private int diff = Integer.MAX_VALUE;

	public int minDiffInBST(TreeNode root) {
		if (root == null) {
			return diff;
		}
		int val = root.val;

		TreeNode prev = root.left;
		int prevVal = val;
		while (prev != null) {
			prevVal = prev.val;
			prev = prev.right;
		}
		if (val - prevVal > 0 && diff > val - prevVal) {
			diff = val - prevVal;
		}

		TreeNode next = root.right;
		int nextVal = val;
		while (next != null) {
			nextVal = next.val;
			next = next.left;
		}
		if (nextVal - val > 0 && diff > nextVal - val) {
			diff = nextVal - val;
		}
		minDiffInBST(root.left);
		minDiffInBST(root.right);
		return diff;
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
