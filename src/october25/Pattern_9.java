package october25;

import java.util.Scanner;

public class Pattern_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			if (i > 1) {
				for (int j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			if (i > 1) {
				for (int j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}

			System.out.println();
		}
		scan.close();
	}
}
