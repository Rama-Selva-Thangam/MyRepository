package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class DecryptString {
	public static String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		String alpha = "#abcdefghijklmnopqrstuvwxyz";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '#') {
				int temp = Integer.parseInt(s.substring(i - 2, i));
				i -= 2;
				sb.append(alpha.charAt(temp));
			} else {
				int temp = Integer.parseInt(s.charAt(i) + "");
				sb.append(alpha.charAt(temp));
			}
		}
		return String.valueOf(sb.reverse());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		String result = freqAlphabets(word);
		System.out.println(result);
		scan.close();

	}

}
