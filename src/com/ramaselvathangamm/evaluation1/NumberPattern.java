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

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Rows : ");
		int n = scan.nextInt();
		spiralPattern(n);
		scan.close();
	}
}
