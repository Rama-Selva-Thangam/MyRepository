package com.ramaselvathangamm.leetcode;

public class Search2DArray {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int index = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (target == matrix[i][matrix[i].length-1]) {
				return true;
			} else if (target <= matrix[i][matrix[i].length-1]) {
				index = i;
				break;
			}
		}
		for (int i = 0; i < matrix[index].length; i++) {
			if (matrix[index][i] == target) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		boolean result = searchMatrix(matrix, target);
		System.out.println(result);
	}

}
