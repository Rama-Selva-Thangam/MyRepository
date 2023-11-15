package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class ReverseWordsInaString {
	public static String reverseWords(String s) {
		String[] arr = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i] + " ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		String res = reverseWords(word);
		System.out.println(res);
		scan.close();
	}
}