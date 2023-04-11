package code;

public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int lastR = grid[0].length - 1;
        for (int[] row : grid) {
            int l = 0;
            int r = lastR;
            if (row[l] < 0) {
                ans += row.length;
                lastR = 0;
                continue;
            }
            if (row[r] >= 0) {
                continue;
            }

            while (l < r) {
                int m = l + (r - l) / 2;
                if (row[m] < 0) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
            lastR = r;
            ans += row.length - r;
        }
        return ans;
    }
}
