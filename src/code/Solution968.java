package code;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution968 {
	int ans;
	Set<TreeNode> covered;

	public int minCameraCover(TreeNode root) {
		ans = 0;
		covered = new HashSet<>();
		covered.add(null);

		dfs(root, null);
		return ans;
	}

	public void dfs(TreeNode node, TreeNode par) {
		if (node != null) {
			dfs(node.left, node);
			dfs(node.right, node);

			if (par == null && !covered.contains(node) ||
					!covered.contains(node.left) ||
					!covered.contains(node.right)) {
				ans++;
				covered.add(node);
				covered.add(par);
				covered.add(node.left);
				covered.add(node.right);
			}
		}
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
