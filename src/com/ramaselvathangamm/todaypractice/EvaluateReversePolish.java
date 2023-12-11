package com.ramaselvathangamm.todaypractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolish {
	public int evalRPN(String[] tokens) {
		List<Integer> list = new ArrayList<Integer>();
		int a, b;

		for (String str : tokens) {
			if (isOperator(str)) {
				a = list.remove(list.size() - 1);
				b = list.remove(list.size() - 1);
				list.add(performOperation(b, a, str));
			} else {
				list.add(Integer.parseInt(str));
			}
		}

		return list.get(0);
	}

	private boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	}

	private int performOperation(int a, int b, String operator) {
		switch (operator) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}

	public static int evalRPN2(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		int a, b;
		for (String str : tokens) {
			switch (str) {
			case "+":
				a = stack.pop();
				b = stack.pop();
				stack.push(b + a);
				break;
			case "-":
				a = stack.pop();
				b = stack.pop();
				stack.push(b - a);
				break;
			case "*":
				a = stack.pop();
				b = stack.pop();
				stack.push(b * a);
				break;
			case "/":
				a = stack.pop();
				b = stack.pop();
				stack.push(b / a);
				break;
			default:
				stack.push(Integer.parseInt(str));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {

	}

}
