package com.ramaselvathangamm.evaluation2;

import java.util.Arrays;
import java.util.Scanner;

public class Question_5 {
	private int[][] indexOfWord(String word, String search, int column) {
		int row = word.length() / column;
		if (word.length() % column != 0) {
			row++;
		}
		int[][] result = new int[2][2];
		int c = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (word.charAt(c) == search.charAt(0)) {
					int endRow = i;
					int endColumn = j + search.length() - 1;
					if (endColumn < column) {
						boolean match = true;
						for (int k = 1; k < search.length(); k++) {
							if (word.charAt(c + k) != search.charAt(k)) {
								match = false;
								break;
							}
						}
						if (match) {
							result[0][0] = i;
							result[0][1] = j;
							result[1][0] = endRow;
							result[1][1] = endColumn;
							return result;
						}
					}
				}
				c++;
			}
		}

		result[0][0] = result[0][1] = result[1][0] = result[1][1] = -1;
		return result;
	}

	public static void main(String[] args) {
		Question_5 question = new Question_5();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		System.out.print("Enter the String to Search : ");
		String search = scan.nextLine();
		int column = 5;
		int[][] res = question.indexOfWord(word, search, column);
		for (int[] x : res) {
			System.out.println(Arrays.toString(x));
		}
	}
}
