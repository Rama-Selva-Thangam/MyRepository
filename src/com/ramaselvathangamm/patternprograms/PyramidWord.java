package com.ramaselvathangamm.patternprograms;

import java.util.Scanner;

public class PyramidWord {
	public static void printPattern(String input) {
		int index = 0;
		for (int i = 1; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				index = i;
				break;
			}
		}
		String first = input.substring(0, index).toUpperCase();
		String second = input.substring(index).toUpperCase();
		String s1 = "", s2 = "";
		for (int i = 0; i < (first.length() | second.length()); i++) {
			if (i < first.length()) {
				s1 += first.charAt(i);
			}
			if (i < second.length()) {
				s2 += second.charAt(i);
			}
			System.out.println(s1 + s2);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		printPattern(word);
	}
}
