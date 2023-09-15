package code;

import java.util.HashSet;
import java.util.Set;

public class Solution1584 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] dist = new int[n];
        for (int i = 1; i < n; i++) {
            dist[i] = distance(points[0], points[i]);
        }
        Set<Integer> mst = new HashSet<>();
        mst.add(0);
        int ans = 0;
        while (mst.size() < n) {
            int next = -1;
            for (int i = 0; i < n; i++) {
                if (!mst.contains(i) && (next == -1 || dist[next] > dist[i])) {
                    next = i;
                }
            }
            mst.add(next);
            ans += dist[next];
            for (int i = 0; i < n; i++) {
                if (!mst.contains(i)) {
                    dist[i] = Math.min(dist[i], distance(points[i], points[next]));
                }
            }
        }
        return ans;
    }

    private int distance(int[] x, int[] y) {
        return Math.abs(x[0] - y[0]) + Math.abs(x[1] - y[1]);
    }
}
