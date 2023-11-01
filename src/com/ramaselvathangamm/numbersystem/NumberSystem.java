package com.ramaselvathangamm.numbersystem;

import java.util.Scanner;

public class NumberSystem {
	public static long binaryToDecimal(String s) {
		if (s.length() > 32 || !s.matches("[0-1]+"))
			return 0;
		long result = 0;
		int length = s.length();
		for (int i = 0; i < s.length(); i++) {
			result += (s.charAt(length - (i + 1)) - '0') * Math.pow(2, length - 1 - i);
		}
		return result;
	}

	public static String DecimalToBinary(long number) {
		StringBuilder decimal = new StringBuilder();
		while (number > 0) {
			decimal.append(number % 2);
			number /= 2;
		}
		return decimal.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Binary Value : ");
		String binary = scan.nextLine();
		System.out.println(binaryToDecimal(binary));
		System.out.print("Enter the Decimal Value : ");
		long number = scan.nextLong();
		System.out.println(DecimalToBinary(number));
		scan.close();

	}

}
