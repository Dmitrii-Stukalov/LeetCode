package code;

public class Solution200 {
	public int numIslands(char[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					helper(grid, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private void helper(char[][] grid, int i, int j) {
		if (i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1 || grid[i][j] != '1') {
			return;
		}
		grid[i][j] = '2';
		helper(grid, i - 1, j);
		helper(grid, i + 1, j);
		helper(grid, i, j - 1);
		helper(grid, i, j + 1);
	}
}
