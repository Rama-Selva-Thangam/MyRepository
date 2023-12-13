package com.ramaselvathangamm.maheshsan;

public class SudokuSolver {
	public static void sudokuSolver(int[][] board) {
		boolean solved = solveSudoku(board);

	}

	private static boolean solveSudoku(int[][] board) {
		int[] emptyCell = findEmptyCell(board);
		if (emptyCell == null) {
			return true;
		}
		int row = emptyCell[0];
		int col = emptyCell[1];
		for (int num = 1; num <= 9; num++) {
			if (isValid(board, row, col, num)) {
				board[row][col] = num;
			}
		}
		return false;
	}

	private static boolean isValid(int[][] board, int row, int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == num || board[i][col] == num) {
				return false;
			}
		}
		return true;
	}

	private static int[] findEmptyCell(int[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[][] board = { 
							{ 5, 3, 0, 0, 7, 0, 0, 0, 0 },
							{ 6, 0, 0, 1, 9, 5, 0, 0, 0 }, 
							{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
							{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, 
							{ 4, 0, 0, 8, 0, 3, 0, 0, 1 }, 
							{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
							{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, 
							{ 0, 0, 0, 4, 1, 9, 0, 0, 5 }, 
							{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } 
						};
		
		sudokuSolver(board);
		
	}

}
