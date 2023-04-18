package code;

public class Solution1706 {
    public int[] findBall(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            ans[i] = fallBall(i, grid);
        }
        return ans;
    }

    private int fallBall(int i, int[][] grid) {
        for (int[] row : grid) {
            if (i < 0 || i >= row.length) {
                return -1;
            }
            if (i + 1 < row.length && row[i] == 1 && row[i + 1] == 1) {
                i++;
                continue;
            }
            if (i - 1 >= 0 && row[i] == -1 && row[i - 1] == -1) {
                i--;
                continue;
            }
            return -1;
        }
        return i;
    }
}
