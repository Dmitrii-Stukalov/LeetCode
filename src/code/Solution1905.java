package code;

public class Solution1905 {
	private int[][] grid1;
	private int[][] grid2;

	public int countSubIslands(int[][] grid1, int[][] grid2) {
		this.grid1 = grid1;
		this.grid2 = grid2;
		int count = 0;
		for (int i = 0; i < grid1.length; i++) {
			for (int j = 0; j < grid1[0].length; j++) {
				if (grid2[i][j] == 1 && dfs(i, j)) {
					count++;
				}
			}
		}
		return count;
	}

	private boolean dfs(int i, int j) {
		if (i < 0 || i > grid2.length - 1 || j < 0 || j > grid2[0].length - 1 || grid2[i][j] == 0) {
			return true;
		}
		grid2[i][j] = 0;

		boolean up = dfs(i - 1, j);
		boolean down = dfs(i + 1, j);
		boolean left = dfs(i, j - 1);
		boolean right = dfs(i, j + 1);
		return up && down && left && right && grid1[i][j] == 1;
	}
}
