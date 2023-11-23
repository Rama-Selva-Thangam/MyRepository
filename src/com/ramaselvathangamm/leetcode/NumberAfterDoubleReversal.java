package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class NumberAfterDoubleReversal {
	
	public static boolean isSameAfterReversals(int num) {
		int rev1 = reverseNumber(num);
		int rev2 = reverseNumber(rev1);
		return num == rev2;
	}

	public static int reverseNumber(int num) {
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		boolean result = isSameAfterReversals(num);
		System.out.println(result);
		scan.close();

	}

}
