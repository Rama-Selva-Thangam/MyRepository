package com.ramaselvathangamm.todaypractice;

import java.util.Scanner;

public class CalculateMoney {
	public static int totalMoney(int n) {
		int sum = 0, daily = 1, start = 1;
		for (int i = 1; i <= n; i++) {
			sum += daily;
			if (i % 7 == 0)
				daily = start++;
			daily++;
		}
		return sum;
	}

	public static int totalMoney1(int n) {
		if (n <= 7) {
			return n * (n + 1) / 2;
		}
		int quotient = n / 7;
		int reminder = n % 7;
		int temp = 7 * ((quotient - 1) * (quotient) / 2);
		int increment = (quotient + 1) + (quotient + reminder);
		return ((quotient * 28) + temp) + (reminder * increment) / 2;
	}

	public static int totalMoney3(int n) {

		int i = 1, j = 0, sum = 0, count = 1, su = 1;
		while (i != n + 1) {
			if (j == 7) {
				su++;
				count = su;
				sum += count;
				count++;
				j = 1;
			} else {
				sum += count;
				count++;
				j++;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Days : ");
		int days = scan.nextInt();
		int result = totalMoney3(days);
		System.out.println(result);
	}

}
