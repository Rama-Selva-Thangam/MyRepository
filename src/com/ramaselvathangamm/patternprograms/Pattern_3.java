package com.ramaselvathangamm.patternprograms;

import java.util.Scanner;

public class Pattern_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= 2 * rows - 1; j++) {
				if (i == 1 || i == j || i + j == 2 * rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
