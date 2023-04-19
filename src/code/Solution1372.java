package code;

import java.util.Objects;

public class Solution1372 {
    public int longestZigZag(TreeNode root) {
        return Math.max(helper(root.left, false, 0),
                helper(root.right, true, 0));
    }

    private int helper(TreeNode node, boolean cameFromLeft, int curLength) {
        if (node == null) {
            return curLength;
        }
        curLength++;
        if (cameFromLeft) {
            return Math.max(helper(node.left, false, curLength),
                    helper(node.right, true, 0));
        } else {
            return Math.max(helper(node.right, true, curLength),
                    helper(node.left, false, 0));
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
