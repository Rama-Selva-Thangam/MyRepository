package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class AlternateMergeString {
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		int length = Math.max(word1.length(), word2.length());
		for (int i = 0; i < length; i++) {
			if (i < word1.length()) {
				sb.append(word1.charAt(i));
			}
			if (i < word2.length()) {
				sb.append(word2.charAt(i));
			}
		}
		return String.valueOf(sb);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String word1 = scan.nextLine();
		System.out.print("Enter the Second String : ");
		String word2 = scan.nextLine();
		String result = mergeAlternately(word1, word2);
		System.out.println(result);
		scan.close();

	}

}
