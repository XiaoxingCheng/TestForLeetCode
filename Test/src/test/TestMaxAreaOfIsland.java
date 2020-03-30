package test;

public class TestMaxAreaOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		System.out.println(maxAreaOfIsland(grid));
	}

	public static int maxAreaOfIsland(int[][] grid) {
		if (grid == null)
			return 0;
		int[][] dp = new int[grid.length][grid[0].length];
		dp[0][0] = 0;
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					dp[i][j] = dfs(i, j, grid);
					result = Math.max(result, dp[i][j]);
				}
			}
		}
		return result;
	}

	public static int dfs(int i, int j, int[][] grid) {
		if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
			grid[i][j] = 0;
			return dfs(i - 1, j, grid) + dfs(i + 1, j, grid) + dfs(i, j - 1, grid) + dfs(i, j + 1, grid) + 1;
		}
		return 0;
	}

}
