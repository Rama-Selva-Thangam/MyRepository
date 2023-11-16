package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class CountingBits {
	public static int[] countBits(int n) {
		int[] res = new int[n + 1];
		return res;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = scan.nextInt();
		int[] result = countBits(num);
		System.out.println(Arrays.toString(result));
		scan.close();
	}

}
