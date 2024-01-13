package com.ramaselvathangamm.rajeesan;

import java.util.Scanner;

public class ReverseStringFromIndex {
	public static String reverseStringIndex(String word, int start, int end) {
		if (word.isEmpty() || start < 0 || end >= word.length() || start >= end) {
			return "";
		}
		char[] charArray = word.toCharArray();
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		System.out.print("Enter the Starting Index : ");
		int start = scan.nextInt();
		System.out.print("Enter the Ending Index : ");
		int end = scan.nextInt();
		String result = reverseStringIndex(word, start, end);
		System.out.println("Reversed String : " + result);
		scan.close();
	}
}
