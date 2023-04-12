package code;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution1162 {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    q.offer(new int[]{i, j});
                }
            }
        }
        if (q.isEmpty() || q.size() == n * n) {
            return -1;
        }
        int res = -1;
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            int size = q.size();
            res++;
            while (size-- > 0) {
                int[] cell = q.poll();
                if (cell == null) {
                    continue;
                }
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < n && j >= 0 && j < n && grid[i][j] == 0) {
                        grid[i][j] = 1;
                        q.add(new int[]{i, j});
                    }
                }
            }
        }
        return res;
    }
}