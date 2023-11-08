package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcronymChecker {
	public static boolean isAcronym(List<String> words, String s) {
		StringBuilder str = new StringBuilder();
		for (String w : words) {
			str.append(w.charAt(0));
		}
		return s.equals(str.toString());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		System.out.print("Enter the Array Length : ");
		int length = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the words : ");

		for (int i = 0; i < length; i++) {
			String word = scan.nextLine();
			words.add(word);
		}
		System.out.print("Enter the String  : ");
		String s = scan.nextLine();
		boolean result = isAcronym(words, s);
		System.out.println(result);
		scan.close();

	}

}
