package com.ramaselvathangamm.rajeesan;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumScalarProduct {

	public static int findMinimumScalarProduct(int n, int[] v1, int[] v2) {
		Arrays.sort(v1);
		Arrays.sort(v2);
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += v1[i] * v2[n - 1 - i];
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Length of Vector : ");
		int length = scanner.nextInt();
		int[] v1 = new int[length];
		System.out.print("Enter the Elements of V1 : ");
		for (int i = 0; i < length; i++) {
			v1[i] = scanner.nextInt();
		}
		int[] v2 = new int[length];
		System.out.print("Enter the Elements of V2 : ");
		for (int i = 0; i < length; i++) {
			v2[i] = scanner.nextInt();
		}
		int minScalarProduct = findMinimumScalarProduct(length, v1, v2);
		System.out.println("Minimum Scalar Product : " + minScalarProduct);

		scanner.close();
	}
}
