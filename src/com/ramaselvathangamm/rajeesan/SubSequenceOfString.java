package com.ramaselvathangamm.rajeesan;

import java.util.Scanner;

public class SubSequenceOfString {

	public static boolean hasRepeatedSubsequence(String s) {
		int len = s.length();
		int[][] arr = new int[len + 1][len + 1];
		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= len; j++) {
				if (s.charAt(i - 1) == s.charAt(j - 1) && i != j) {
					arr[i][j] = 1 + arr[i - 1][j - 1];
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}
		return arr[len][len] >= 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		boolean result = hasRepeatedSubsequence(input);

		if (result) {
			System.out.println("Repeated Subsequence Exists.");
		} else {
			System.out.println("Repeated Subsequence Doesn't Exist");
		}
	}

}
