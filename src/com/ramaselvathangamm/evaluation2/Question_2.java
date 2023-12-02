package com.ramaselvathangamm.evaluation2;

import java.util.Scanner;

public class Question_2 {
	private int[][] transposeMatrix(int[][] nums) {
		int[][] result = new int[nums[0].length][nums.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = nums[j][i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Question_2 question = new Question_2();
		System.out.println("Enter the number of rows:");
		int m = scan.nextInt();
		System.out.println("Enter the number of columns:");
		int n = scan.nextInt();

		int[][] nums = new int[m][n];
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter " + i + " " + j + " element");
				nums[i][j] = scan.nextInt();
			}
		}
		for (int[] arr : nums) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		int[][] result = question.transposeMatrix(nums);
		System.out.println("Transposed Matrix:");
		for (int[] arr : result) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
