package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfNonZeroIntegers {
	public static int[] getNoZeroIntegers(int n) {
		for (int i = 1; i < n; i++) {
			int c = n - i;
			if (check(c) && check(i)) {
				return new int[] { i, c };
			}
		}

		return new int[] { 0, 0 };
	}

	public static boolean check(int m) {
		while (m > 0) {
			int digit = m % 10;
			if (digit == 0) {
				return false;
			}
			m /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int[] result = getNoZeroIntegers(num);
		System.out.println(Arrays.toString(result));
		scan.close();

	}

}
