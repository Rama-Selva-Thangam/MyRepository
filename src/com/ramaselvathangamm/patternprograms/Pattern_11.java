package com.ramaselvathangamm.patternprograms;

import java.util.Scanner;

public class Pattern_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows: ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <=rows; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		scan.close();
	}
}
