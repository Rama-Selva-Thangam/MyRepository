package com.ramaselvathangamm.pyramidprograms;

import java.util.Scanner;

public class Pyramid_5 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int rows = scan.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}

		scan.close();
	}
}