package com.ramaselvathangamm.todaypractice;

import java.util.Scanner;

public class CountNumberOfBits {
	public static int hammingWeight1(int n) {
		int bitCount = 0;
		while (n != 0) {
			bitCount += n % 2 == 1 ? 1 : 0;
			n /= 2;
		}
		return bitCount;
	}

	public static int hammingWeight2(int n) {
		int bitCount = 0;
		while (n != 0) {
			bitCount += n & 1;
			n >>>= 1;
		}
		return bitCount;
	}

	public static int hammingWeight3(int n) {
		int bitCount = 0;

		while (n != 0) {
			n = n & (n - 1);
			bitCount++;
		}

		return bitCount;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = scan.nextInt();
		int result = hammingWeight1(num);
		System.out.println(result);
		scan.close();
	}

}
