package code;

public class Solution1020 {
	private int[][] grid;
	private boolean[][] visited;

	public int numEnclaves(int[][] grid) {
		this.grid = grid;
		int m = grid.length;
		int n = grid[0].length;
		visited = new boolean[m][n];
		for (int i = 0; i < m; ++i) {
			if (grid[i][0] == 1 && !visited[i][0]) {
				dfs(i, 0);
			}
			if (grid[i][n - 1] == 1 && !visited[i][n - 1]) {
				dfs(i, n - 1);
			}
		}

		for (int i = 0; i < n; ++i) {
			if (grid[0][i] == 1 && !visited[0][i]) {
				dfs(0, i);
			}
			if (grid[m - 1][i] == 1 && !visited[m - 1][i]) {
				dfs(m - 1, i);
			}
		}

		int ans = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1 && !visited[i][j]) {
					ans++;
				}
			}
		}
		return ans;
	}

	private void dfs(int i, int j) {
		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
			return;
		}
		visited[i][j] = true;

		dfs(i - 1, j);
		dfs(i + 1, j);
		dfs(i, j - 1);
		dfs(i, j + 1);
	}
}
