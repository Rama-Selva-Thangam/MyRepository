package october25;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number of Rows : ");
		int rows = scan.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == 1 || j == rows || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scan.close();

	}

}
