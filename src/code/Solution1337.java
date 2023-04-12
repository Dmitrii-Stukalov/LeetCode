package code;

import java.util.Objects;
import java.util.PriorityQueue;

public class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->
                                                        a[0] != b[0]
                                                        ? b[0] - a[0]
                                                        : b[1] - a[1]);
        int[] ans = new int[k];

        for (int i = 0; i < mat.length; i++) {
            queue.offer(new int[]{numOnes(mat[i]), i});
            if (queue.size() > k) {
                queue.poll();
            }
        }

        while (k > 0) {
            ans[--k] = Objects.requireNonNull(queue.poll())[1];
        }

        return ans;
    }

    private int numOnes(int[] row) {
        int l = 0;
        int r = row.length;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (row[m] == 1) {
                l = m + 1;
            } else {
                r = m;
            }
        }

        return l;
    }
}
