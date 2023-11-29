package com.ramaselvathangamm.leetcode;

public class RotateImage {
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - j - 1];
				matrix[i][matrix.length - j - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int[] ar : matrix) {
			for (int i : ar) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}
		System.out.println();
		rotate(matrix);
		for (int[] ar : matrix) {
			for (int i : ar) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}
	}

}
