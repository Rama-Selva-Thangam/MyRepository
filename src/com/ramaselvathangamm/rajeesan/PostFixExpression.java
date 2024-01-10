package com.ramaselvathangamm.rajeesan;

import java.util.Scanner;
import java.util.Stack;

public class PostFixExpression {
	public static int evaluateExpression(String s) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				stack.push(c - '0');
			} else if (c == '+' || c == '-' || c == '*' || c == '/') {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				int res = evaluate(c, operand1, operand2);
				stack.push(res);

			}
		}
		return stack.pop();
	}

	static int evaluate(char c, int operand1, int operand2) {
		switch (c) {
		case '+':
			return operand2 + operand1;
		case '-':
			return operand2 - operand1;
		case '*':
			return operand2 * operand1;
		case '/':
			return operand2 / operand1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.nextLine();
		int result = evaluateExpression(s);
		System.out.println(result);
	}

}
