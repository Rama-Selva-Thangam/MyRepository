package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class CountOperation {
	public static int countOperations(int num1, int num2) {
		int count = 0;
		while (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				num1 = num1 - num2;
				count++;
			} else {
				num2 = num2 - num1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		int num1 = scan.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = scan.nextInt();
		int result = countOperations(num1, num2);
		System.out.println(result);
		scan.close();

	}

}
