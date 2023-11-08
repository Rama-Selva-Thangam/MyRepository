package com.ramaselvathangamm.numbersystem;

import java.util.Scanner;

public class NumberSystem {
	public static long binaryToDecimal(String s) {
		if (s.length() > 32 || !s.matches("[0-1]+"))
			return 0;
		long result = 0;
		int n = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			result += (s.charAt(i) - '0') * Math.pow(2, n);
			n--;
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

	public static long octalToDecimal(String s) {
		long result = 0;
		if (s.length() > 32 || !s.matches("[0-7]+"))
			return 0;
		int n = s.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			result += (s.charAt(i) - '0') * Math.pow(2, n);
			n--;
		}
		return result;
	}

	public static String decimalToOctal(long number) {
		StringBuilder decimal = new StringBuilder();
		while (number > 8) {
			decimal.append(number % 8);
			number /= 8;
		}
		return decimal.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Binary Value to covert Decimal : ");
		String binary = scan.nextLine();
		System.out.println("Decimal Value of " + binary + " is " + binaryToDecimal(binary));
		System.out.print("Enter the Decimal Value to Convert Binary : ");
		long number1 = scan.nextLong();
		scan.nextLine();
		System.out.println("Binary Value of " + number1 + " is " + DecimalToBinary(number1));
		System.out.print("Enter the octal Value to covert Decimal : ");
		String octal = scan.nextLine();
		System.out.println("Decimal Value of " + octal + " is " + octalToDecimal(octal));
		long number2 = scan.nextLong();
		System.out.println("Octal Value of " + number2 + " is " + decimalToOctal(number2));
		scan.close();

	}

}
