package code;

import java.util.ArrayList;
import java.util.List;

public class Solution133 {
	private final Node[] copies = new Node[100];

	public Node cloneGraph(Node node) {
		if (node == null) {
			return null;
		}
		return dfs(node);
	}

	private Node dfs(Node node) {
		if (copies[node.val - 1] != null) {
			return copies[node.val - 1];
		}
		copies[node.val - 1] = new Node(node.val);

		for (Node n : node.neighbors) {
			copies[node.val - 1].neighbors.add(dfs(n));
		}
		return copies[node.val - 1];
	}


	public static class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<>();
		}

		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<>();
		}

		public Node(int _val, List<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}
}
