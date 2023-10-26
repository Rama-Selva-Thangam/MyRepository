package october25;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = scan.nextInt();
		for (int i = 1; i <= 2 * rows - 1; i++) {
			for (int j = 1; j <= rows; j++) {
				if (j == 1 || i == j || i + j == 2 * rows) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
