package com.ramaselvathangamm.leetcode;

public class SpecialPositionInBinary {
	public static int numSpecial(int[][] mat) {
		int count = 0;
		int rows = mat.length;
		int cols = mat[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 1) {
					boolean isSpecial = true;
					for (int k = 0; k < cols; k++) {
						if (k != j && mat[i][k] == 1) {
							isSpecial = false;
							break;
						}
					}
					if (isSpecial) {
						for (int k = 0; k < rows; k++) {
							if (k != i && mat[k][j] == 1) {
								isSpecial = false;
								break;
							}
						}
					}

					if (isSpecial) {
						count++;
					}
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int result = numSpecial(mat);
		System.out.println(result);
	}

}
