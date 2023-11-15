package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class FirstPalindromicString {
	public static String firstPalindrome(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (isPalindrome(words[i])) {
				return words[i];
			}
		}
		return "";
	}

	public static boolean isPalindrome(String s) {
		int j = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length of array : ");
		int length = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[length];
		System.out.println("Enter the Strings : ");
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextLine();
		}
		String res = firstPalindrome(arr);
		System.out.println(res);
		scan.close();
	}

}
