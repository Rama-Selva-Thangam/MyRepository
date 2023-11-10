package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;

public class JumbledNumber {
	public static boolean isJumbledNumber(int number) {
		while (number > 0) {
			int reminder = number % 10;
			int secondReminder = (number / 10) % 10;
			if (Math.abs(reminder - secondReminder) > 1)
				return false;
			number/=10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = scan.nextInt();
		if (isJumbledNumber(number)) {
			System.out.print(number + " is a Jumbled Number");
		} else {
			System.out.println(number + " is not a Jumbled Number");
		}
		scan.close();

	}

}
