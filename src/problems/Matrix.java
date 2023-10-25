package problems;

import java.util.Scanner;

public class Matrix {
	public static int[][] multiplyMatrix(int[][] a, int[][] b) {
		int rowA = a.length;
		int colA = a[0].length;
		int rowB = b.length;
		int colB = b[0].length;
		if (colA != rowB) {
			return a;
		}
		int[][] result = new int[rowA][colB];
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				int sum = 0;
				for (int k = 0; k < colA; k++) {
					sum += a[i][k] * b[k][j];
				}
				result[i][j] = sum;

			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for matrix A :");
		int rowA = scanner.nextInt();
		System.out.print("Enter the number of columns for matrix A :");
		int colA = scanner.nextInt();

		int[][] matrixA = new int[rowA][colA];

		System.out.println("Enter the elements of matrix A : ");
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colA; j++) {
				matrixA[i][j] = scanner.nextInt();
			}
		}

		System.out.print("Enter the number of rows for matrix B : ");
		int rowB = scanner.nextInt();
		System.out.print("Enter the number of columns for matrix B : ");
		int colB = scanner.nextInt();

		int[][] matrixB = new int[rowB][colB];

		System.out.println("Enter the elements of matrix B : ");
		for (int i = 0; i < rowB; i++) {
			for (int j = 0; j < colB; j++) {
				matrixB[i][j] = scanner.nextInt();
			}
		}

		if (colA != rowB) {
			System.out.println("Matrix Dimension not Possible for Multiplication");
		}

		int[][] result = multiplyMatrix(matrixA, matrixB);

		System.out.println("Result : ");
		for (int i = 0; i < rowA; i++) {
			for (int j = 0; j < colB; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
