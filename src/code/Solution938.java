package code;

import java.util.Objects;

public class Solution938 {
    int ans = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return -1;
        }
        if (root.val >= low && root.val <= high) {
            ans += root.val;
        }
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);
        return ans;
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