package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> firstLeafs = new ArrayList<>();
        List<Integer> secondLeafs = new ArrayList<>();
        findLeafs(root1, firstLeafs);
        findLeafs(root2, secondLeafs);
        return firstLeafs.equals(secondLeafs);
    }

    private void findLeafs(TreeNode root, List<Integer> list) {
        if (root.left != null) {
            findLeafs(root.left, list);
        }
        if (root.right != null) {
            findLeafs(root.right, list);
        }
        if (root.left == null && root.right == null) {
            list.add(root.val);
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
