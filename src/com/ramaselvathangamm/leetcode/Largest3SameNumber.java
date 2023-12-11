package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class Largest3SameNumber {
	public String largestGoodInteger(String num) {
		int max = -1;
		for (int i = 1; i < num.length() - 1; i++) {
			if (num.charAt(i - 1) == num.charAt(i) && num.charAt(i) == num.charAt(i + 1)) {
				int temp = Integer.parseInt(String.valueOf(num.charAt(i)));
				if (temp > max) {
					max = temp;
				}
			}
		}
		if (max < 0)
			return "";
		return "" + max + max + max;

	}

	public static void main(String[] args) {
		Largest3SameNumber largest3SameNumber = new Largest3SameNumber();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String digits = scan.nextLine();
		String result = largest3SameNumber.largestGoodInteger(digits);
		System.out.println(result);
	}

}
