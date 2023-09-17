package code;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution847 {
    public int shortestPathLength(int[][] graph) {
        int[][] dp = new int[graph.length][1 << graph.length];
        Queue<State> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][1 << i] = 0;
            q.offer(new State(1 << i, i));
        }

        while (!q.isEmpty()) {
            State state = q.poll();
            for (int next : graph[state.source]) {
                int nextMask = state.mask | 1 << next;
                if (dp[next][nextMask] > dp[state.source][state.mask] + 1) {
                    dp[next][nextMask] = dp[state.source][state.mask] + 1;
                    q.offer(new State(nextMask, next));
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < graph.length; i++) {
            res = Math.min(res, dp[i][(1 << graph.length) - 1]);
        }
        return res;
    }

    private record State(int mask, int source) { }
}
