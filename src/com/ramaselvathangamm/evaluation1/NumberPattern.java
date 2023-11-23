package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class NumberPattern {

	public static void printTriangleSpiral(int n) {
		int[][] matrix = new int[n][n];
		int number = 1;
		int left = 0, right = n - 1, top = 0, bottom = n - 1;
		while (left <= right && top <= bottom) {
			for (int i = top; i <= bottom; i++) {
				matrix[i][i + top] = number++;
			}
			bottom--;
			left++;
			for (int i = bottom; i >= top; i--) {
				matrix[i][right] = number++;
			}
			right--;
			bottom--;
			for (int i = right; i >= left; i--) {
				matrix[top][i] = number++;
			}
			top++;
			left++;
		}
		for (int[] k : matrix) {
			for (int l : k) {
				if (l == 0) {
					System.out.printf("   ");
				} else {
					System.out.printf("%2d ", l);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int n = scan.nextInt();
		printTriangleSpiral(n);
		scan.close();
	}
}
