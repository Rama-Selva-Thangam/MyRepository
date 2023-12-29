package com.ramaselvathangamm.maheshsan;

import java.util.Scanner;
import java.util.Stack;

public class DecodeSequence {

	public static String decodeSequence(String code) {
		if (code.length() > 8) {
			return "";
		}
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder result = new StringBuilder();
		for (int i = 0; i <= code.length(); i++) {
			stack.push(i + 1);
			if (i == code.length() || code.charAt(i) == 'I') {
				while (!stack.isEmpty()) {
					result.append(stack.pop());
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number Test Cases: ");
		int testCases = scan.nextInt();
		scan.nextLine();
		while (testCases > 0) {
			System.out.print("Enter the Code: ");
			String code = scan.nextLine();
			String result = decodeSequence(code);
			System.out.println(result);
			System.out.println("-----");
			testCases--;
		}

		scan.close();
	}
}
