package test;

import java.util.LinkedList;
import java.util.Queue;

public class TestRottingOranges {

	public static void main(String[] args) {
		int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
		System.out.println(orangesRotting(grid));
	}

	public static int orangesRotting(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return -1;
		}
		int good = 0;
		int[][] dirs = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		Queue<int[]> queue = new LinkedList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 2) {
					queue.offer(new int[] { i, j });
				} else if (grid[i][j] == 1) {
					good++;
				}
			}
		}
		if (good == 0) {
			return 0;
		}
		
		int res = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int[] q = queue.poll();
				for (int j = 0; j < 4; j++) {
					int newX = q[0] + dirs[j][0];
					int newY = q[1] + dirs[j][1];
					if (newX >= 0 && newX < grid[0].length && newY >= 0 && newY < grid.length
							&& grid[newX][newY] == 1) {
						queue.offer(new int[] { newX, newY });
						grid[newX][newY] = 2;
						good--;
					}
				}
			}
			if (queue.size() != 0) {
				res++;
			} else {
				break;
			}
		}
		return good == 0 ? res : -1;
	}
}
