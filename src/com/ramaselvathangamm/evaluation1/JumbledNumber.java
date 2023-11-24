package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class JumbledNumber {
	public static boolean isJumbledNumber(int number) {
		while (number > 0) {
			int reminder = number % 10;
			int secondReminder = (number / 10) % 10;
			if (Math.abs(reminder - secondReminder) > 1)
				return false;
			number /= 10;
		}
		return true;
	}

	public static boolean isJumbledNumberRecursive(int number) {
		if (number == 0) {
			return true;
		}

		int reminder = number % 10;
		int secondReminder = (number / 10) % 10;

		if (Math.abs(reminder - secondReminder) > 1) {
			return false;
		}

		return isJumbledNumberRecursive(number / 10);
	}

	public static boolean isJumbledNumber1(int number) {
		int prevDigit = -1;

		while (number > 0) {
			int currentDigit = number % 10;

			if (prevDigit != -1 && Math.abs(currentDigit - prevDigit) > 1) {
				return false;
			}

			prevDigit = currentDigit;
			number /= 10;
		}

		return true;
	}

	public static boolean isJumbledNumber2(int number) {
		char[] arr = Integer.toString(number).toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			int digit1 = arr[i];
			int digit2 = arr[i + 1];
			if (Math.abs(digit1 - digit2) > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scan.nextInt();
		if (isJumbledNumberRecursive(number)) {
			System.out.print(number + " is a Jumbled Number");
		} else {
			System.out.println(number + " is not a Jumbled Number");
		}
		scan.close();

	}

}
