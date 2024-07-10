package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class LongestPalindrom {
	public static int longestPalindrome(String word) {
		int length = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				String subs = word.substring(i, j);
				if (isPalindrome(subs)) {
					if (subs.length() > length) {
						length = subs.length();
					}
				}
			}
		}
		return length;
	}

	public static boolean isPalindrome(String word) {
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i) != word.charAt(j))
				return false;
			i++;
			j--;						
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		int result = longestPalindrome(word);
		System.out.println(result);
		scan.close();

	}

}
