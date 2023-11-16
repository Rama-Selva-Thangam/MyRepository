package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class NumberPattern {
	private static void spiralPattern(int rows) {
		int[][] arr = new int[rows][rows];
		int top = 0;
		int bottom = rows - 1;
		int left = 0;
		int right = rows - 1;
		int num = 1;
		while (top < bottom || left < right) {
			for (int i = top; i <= bottom; i++) {
				arr[i][left + i] = num++;
			}
			left++;
			bottom--;
			for (int i = bottom; i >= top; i--) {
				arr[i][right] = num++;
			}
			right--;
			for (int i = right; i >= left; i--) {
				if (i == left && top != 0)
					break;
				arr[top][i] = num++;
			}
			top++;
			bottom--;
		}
		for (int[] ar : arr) {
			for (int i : ar) {
				if (i != 0)
					System.out.printf("%3d", i);
				else
					System.out.print("   ");
			}
			System.out.println("\n");
		}
	}

	public static void printTriangleSpiral(int n) { // New Code
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
