package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class ReverseString {
	public static String reverseWords(String s) {
		String[] str = s.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(new StringBuilder(str[i]).reverse() + " ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word=scan.nextLine();
		String result=reverseWords(word);
		System.out.println(result);
		scan.close();
	}

}
