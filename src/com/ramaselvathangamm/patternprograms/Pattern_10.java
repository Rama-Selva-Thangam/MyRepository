package com.ramaselvathangamm.patternprograms;

import java.util.Scanner;

public class Pattern_10 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int rows = scan.nextInt();
		for (int i = 1; i <= 2 * rows; i++) {
			for (int j = 1; j <= 2 * rows; j++) {
				if (i + j <= rows + 1 || i - j >= rows || j - i >= rows || i + j >= 3 * rows + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		scan.close();
	}
}