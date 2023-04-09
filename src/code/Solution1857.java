package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1857 {
	public int largestPathValue(String colors, int[][] edges) {
		int n = colors.length();
		int k = 26;
		int[] degrees = new int[n];
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		for (int[] edge : edges) {
			int a = edge[0];
			int b = edge[1];
			graph.get(a).add(b);
			degrees[b]++;
		}

		Set<Integer> zeroDegrees = new HashSet<>();
		for (int i = 0; i < n; i++) {
			if (degrees[i] == 0) {
				zeroDegrees.add(i);
			}
		}

		int[][] counts = new int[n][k];
		for (int i = 0; i < n; i++) {
			counts[i][colors.charAt(i) - 'a']++;
		}
		int maxCount = 0;
		int visited = 0;
		while (!zeroDegrees.isEmpty()) {
			int u = zeroDegrees.iterator().next();
			zeroDegrees.remove(u);
			visited++;
			for (int v : graph.get(u)) {
				for (int i = 0; i < k; i++) {
					counts[v][i] = Math.max(counts[v][i], counts[u][i] + (colors.charAt(v) - 'a' == i ? 1 : 0));
				}
				degrees[v]--;
				if (degrees[v] == 0) {
					zeroDegrees.add(v);
				}
			}
			maxCount = Math.max(maxCount, Arrays.stream(counts[u]).max().getAsInt());
		}
		return visited == n ? maxCount : -1;
	}
}
