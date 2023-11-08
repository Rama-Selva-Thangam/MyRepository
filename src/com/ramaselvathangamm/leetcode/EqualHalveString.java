package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class EqualHalveString {
	public static boolean halvesAreAlike(String s) {
		s = s.toLowerCase();
		int lCount = 0, rCount = 0, pointer = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			char l = s.charAt(i);
			char r = s.charAt(pointer);
			if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
				lCount++;
			}
			if (r == 'a' || r == 'e' || r == 'i' || r == 'o' || r == 'u') {
				rCount++;
			}
			pointer--;
		}
		return lCount == rCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		boolean result = halvesAreAlike(word);
		System.out.println(result);
		scan.close();

	}

}
