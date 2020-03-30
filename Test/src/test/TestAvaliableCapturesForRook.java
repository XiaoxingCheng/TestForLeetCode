package test;

public class TestAvaliableCapturesForRook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int numRookCaptures(char[][] board) {
		if (board == null || board.length == 0)
			return 0;
		int[] dX = { 0, 1, -1, 0 };
		int[] dY = { 1, 0, 0, -1 };
		int len = board.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (board[i][j] == 'R') {
					int res = 0;
					for (int k = 0; k < 4; k++) {
						int x = i;
						int y = j;
						//这里为了在某一行或者某一列循环走到底
						while (true) {
							x += dX[k];
							y += dY[k];
							if (x < 0 || x >= board.length || y < 0 || y >= board.length || board[x][y] == 'B') {
								break;
							}
							if (board[x][y] == 'p') {
								res += 1;
								break;
							}
						}
					}
					return res;
				}
			}
		}
		return 0;
	}

}
