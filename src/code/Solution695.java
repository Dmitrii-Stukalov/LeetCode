package code;

public class Solution695 {
	private int[][] grid;
	private boolean[][] visited;

	public int maxAreaOfIsland(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		this.grid = grid;
		visited = new boolean[m][n];
		int ans = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				ans = Math.max(ans, area(i, j));
			}
		}
		return ans;
	}

	private int area(int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) {
			return 0;
		}
		visited[i][j] = true;
		return 1 + area(i + 1, j) + area(i - 1, j) + area(i, j - 1) + area(i, j + 1);
	}
}
