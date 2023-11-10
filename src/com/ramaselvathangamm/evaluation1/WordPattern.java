package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class WordPattern {
	public static void printPattern(String word, int row) {
		char[][] arr = new char[row][word.length()];
		int i = 0;
		int j = 0;
		int index = 0;
		boolean downward = false;
		while (index < word.length()) {
			arr[i][j] = word.charAt(index);
			index++;
			if (i == 0) {
				downward = true;
			} else if (i == row - 1) {
				downward = false;
			}
			if (downward) {
				i++;
			} else {
				i--;
				j++;

			}
		}
		for (int k = 0; k < arr.length; k++) {
			for (int l = 0; l < arr[0].length; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		System.out.print("Enter the Row : ");
		int row = scan.nextInt();
		printPattern(word, row);
		scan.close();

	}

}

 