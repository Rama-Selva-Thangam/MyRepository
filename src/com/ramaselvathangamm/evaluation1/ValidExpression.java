package com.ramaselvathangamm.evaluation1;

import java.util.Scanner;
import java.util.Stack;

public class ValidExpression {
	public static boolean isValidExpression(String word) {
		word = word.toLowerCase();
		String expressions = "+-*/%";
		Stack<Character> braces = new Stack<Character>();

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);

			if (c == '(') {
				braces.push(c);
			} else if (c == ')') {
				if (braces.isEmpty()) {
					return false;
				}
				char symbol = braces.pop();
				if (symbol != '(') {
					return false;
				}
			} else if (expressions.contains(String.valueOf(c))) {
				if (i != 0 && !String.valueOf(word.charAt(i + 1)).matches("[a-z0-9(]")) {
					return false;
				}
			}
		}

		return braces.isEmpty();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String expression = scan.nextLine();

		if (isValidExpression(expression)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		scan.close();
	}
}
