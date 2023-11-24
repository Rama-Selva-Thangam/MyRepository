package com.ramaselvathangamm.todaypractice;

public class XPattern {
	public static void printPattern(String word) {
		int n = word.length() - 1;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j == i || j == n - i) {
					System.out.print(word.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void printPattern2(String word) {
		int n = word.length();
		char[][] pattern = new char[n][n];
		for (int i = 0; i < n; i++) {
			pattern[i][i] = word.charAt(i);
			pattern[i][n - 1 - i] = word.charAt(i);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (pattern[i][j] != ' ') {
					System.out.print(pattern[i][j]);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void printPatternRecursively(String word) {
		int n = word.length();
		char[][] pattern = new char[n][n];
		fillAndPrintPattern(pattern, word, 0, n - 1, n);

	}

	private static void fillAndPrintPattern(char[][] pattern, String word, int start, int end, int n) {
		if (start > end) {
			printPattern(pattern, n);
			return;
		}
		pattern[start][start] = word.charAt(start);
		pattern[start][end] = word.charAt(start);
		pattern[end][start] = word.charAt(start);
		pattern[end][end] = word.charAt(start);
		fillAndPrintPattern(pattern, word, start + 1, end - 1, n);
	}

	private static void printPattern(char[][] pattern, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(pattern[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPatternRecursively("PROGRAM");
	}

}
