package code;


import java.util.*;

public class Solution662 {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        Map<TreeNode, Integer> nodeNumber = new HashMap<>();
        queue.add(root);
        nodeNumber.put(root, 1);
        int maxWidth = 1;
        while (!queue.isEmpty()) {
            int left = 0;
            int right = 0;
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    left = nodeNumber.get(node);
                }
                if (i == levelSize - 1) {
                    right = nodeNumber.get(node);
                }
                Integer number = nodeNumber.get(node);
                if (node != null && node.left != null) {
                    queue.add(node.left);
                    nodeNumber.put(node.left, number * 2);
                }
                if (node != null && node.right != null) {
                    queue.add(node.right);
                    nodeNumber.put(node.right, number * 2 + 1);
                }
            }
            maxWidth = Math.max(maxWidth, right - left + 1);
        }
        return maxWidth;
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
