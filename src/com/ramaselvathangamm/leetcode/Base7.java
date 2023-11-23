package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class Base7 {
	public static String convertToBase7(int num) {
		if (num == 0) {
			return "0";
		}
		StringBuilder result = new StringBuilder();
		boolean isNegative = num < 0;
		num = Math.abs(num);
		while (num > 0) {
			int remainder = num % 7;
			result.insert(0, remainder);
			num /= 7;
		}
		return isNegative ? "-" + result.toString() : result.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number to Convert Base 7 : ");
		int num = scan.nextInt();
		String res = convertToBase7(num);
		System.out.println(res);
		scan.close();

	}

}
