package code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1631 {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int columns = heights[0].length;
        int[][] dist = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, 0, 0});
        dist[0][0] = 0;
        int[] dir = {0, 1, 0, -1, 0};

        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int d = top[0];
            int row = top[1];
            int col = top[2];
            if (d > dist[row][col]) {
                continue;
            }
            if (row == rows - 1 && col == columns - 1) {
                return d;
            }
            for (int i = 0; i < 4; i++) {
                int nextRow = row + dir[i];
                int nextCol = col + dir[i + 1];
                if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < columns) {
                    int newDist = Math.max(d, Math.abs(heights[nextRow][nextCol] - heights[row][col]));
                    if (dist[nextRow][nextCol] > newDist) {
                        dist[nextRow][nextCol] = newDist;
                        minHeap.offer(new int[]{dist[nextRow][nextCol], nextRow, nextCol});
                    }
                }
            }
        }
        return -1;
    }
}
