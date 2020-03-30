package test;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TestAsFarFromLandAsPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		System.out.println(maxDistance(grid));
	}

	public static int maxDistance(int[][] grid) {
		if (grid == null || grid.length == 0)
			return -1;
		Queue<int[]> queue = new ArrayDeque<>();
		int m = grid.length;
		int n = grid[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					queue.offer(new int[] { i, j });
				}
			}
		}
		boolean flag = false;
		int[] dX = { 0, 0, 1, -1 };
		int[] dY = { 1, -1, 0, 0 };
		// 赋值为null
		int[] point = null;
		while (!queue.isEmpty()) {
			point = queue.poll();
			int x = point[0], y = point[1];
			for (int i = 0; i < 4; i++) {
				int dnX = x + dX[i];
				int dnY = y + dY[i];
				if (dnX < 0 || dnX >= m || dnY < 0 || dnY >= n || grid[dnX][dnY] != 0) {
					continue;
				}
				grid[dnX][dnY] = grid[x][y] + 1;
				flag = true;
				queue.offer(new int[] { dnX, dnY });
			}
		}
		// 没有陆地或海洋，返回-1
		if (!flag || point == null) {
			return -1;
		}
		return grid[point[0]][point[1]] - 1;
	}
}
