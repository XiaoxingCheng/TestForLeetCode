package test;

public class TestSurfaceArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2 } };
		System.out.println(surfaceArea(grid));
	}

	public static int surfaceArea(int[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				int t = grid[i][j];
				if (t > 0) {
					res += (t << 2) + 2;
					res -= i > 0 ? Math.min(t, grid[i - 1][j]) << 1 : 0;
					res -= j > 0 ? Math.min(t, grid[i][j - 1]) << 1 : 0;
				}
			}
		}
		return res;
	}
	/*
	 * public static int surfaceArea(int[][] grid) { if (grid == null || grid.length
	 * == 0) return 0; int res = 0; int[] dX = { 1, 0, -1, 0 }; int[] dY = { 0, 1,
	 * 0, -1 }; for (int i = 0; i < grid.length; i++) { for (int j = 0; j <
	 * grid[i].length; j++) { if (grid[i][j] > 0) { res += 2; for (int k = 0; k < 4;
	 * k++) { int dnX = i + dX[k]; int dnY = j + dY[k]; int dn = 0; if (dnX >= 0 &&
	 * dnX < grid.length && dnY >= 0 && dnY < grid[i].length) { // res +=
	 * Math.max(grid[i][j] - grid[dnX][dnY], 0); dn = grid[dnX][dnY]; } res +=
	 * Math.max(grid[i][j] - dn, 0); } } } } return res; }
	 */
}
