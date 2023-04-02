package code;

public class Solution1254 {
	private int[][] grid;
	private boolean[][] visited;

	public int closedIsland(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		this.grid = grid;
		visited = new boolean[m][n];
		int ans = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0 && !visited[i][j] && dfs(i, j)) {
					ans++;
				}
			}
		}
		return ans;
	}

	private boolean dfs(int i, int j) {
		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
			return false;
		}
		if (visited[i][j] || grid[i][j] == 1) {
			return true;
		}
		visited[i][j] = true;
		boolean isClosed = dfs(i, j - 1);

		if (!dfs(i + 1, j)) {
			isClosed = false;
		}
		if (!dfs(i, j + 1)) {
			isClosed = false;
		}
		if (!dfs(i - 1, j)) {
			isClosed = false;
		}

		return isClosed;
	}
}
