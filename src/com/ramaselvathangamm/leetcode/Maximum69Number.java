package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class Maximum69Number {
	public static int maximum69Number(int num) {
		String str = Integer.toString(num);
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '6') {
				charArray[i] = '9';
				return Integer.parseInt(String.valueOf(charArray));
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int result = maximum69Number(num);
		System.out.println(result);
		scan.close();

	}

}
