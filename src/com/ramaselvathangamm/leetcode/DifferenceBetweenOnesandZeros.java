package com.ramaselvathangamm.leetcode;

public class DifferenceBetweenOnesandZeros {
	public int[][] onesMinusZeros(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int[] Ones = new int[row + col];
		int[] Zeroes = new int[row + col];
		int idx = 0;
		for (int i = 0; i < row; i++) {
			int countOnes = 0;
			int countZeroes = 0;
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == 1) {
					countOnes += 1;
				} else {
					countZeroes += 1;
				}
			}
			Ones[idx] = countOnes;
			Zeroes[idx] = countZeroes;
			idx += 1;
		}
		for (int j = 0; j < col; j++) {
			int countOnes = 0;
			int countZeroes = 0;
			for (int i = 0; i < row; i++) {
				if (grid[i][j] == 1) {
					countOnes += 1;
				} else {
					countZeroes += 1;
				}
			}
			Ones[idx] = countOnes;
			Zeroes[idx] = countZeroes;
			idx += 1;
		}
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				grid[i][j] = Ones[i] + Ones[row + j] - Zeroes[i] - Zeroes[row + j];
			}
		}

		return grid;
	}

	public static void main(String[] args) {

	}

}
