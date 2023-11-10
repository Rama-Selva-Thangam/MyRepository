package com.ramaselvathangamm.evaluation1;

public class SpiralPattern {
	public static void main(String[] args) {
		int[][] pattern = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == 5) {
					pattern[i][j] = i + 1;
				} else {
					pattern[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (pattern[i][j] > 0) {
					System.out.print(pattern[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
