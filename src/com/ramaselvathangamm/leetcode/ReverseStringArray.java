package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringArray {
	public static void reverseString(char[] s) {
		String str = new String(s);
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			s[j++] = str.charAt(i);
		}
		return;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length : ");
		int len = scan.nextInt();
		scan.nextLine();
		char[] s = new char[len];
		for (int i = 0; i < len; i++)
			s[i] = scan.nextLine().charAt(0);
		System.out.println(Arrays.toString(s));
		reverseString(s);
		System.out.println(Arrays.toString(s));
		scan.close();
	}

}
