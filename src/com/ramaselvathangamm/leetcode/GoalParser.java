package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class GoalParser {
	public static String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				sb.append("o");
				i++;
			} else if (command.substring(i, i + 1).matches("\\w+")) {
				sb.append(command.charAt(i));
			}
		}
		return String.valueOf(sb);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		String result = interpret(word);
		System.out.println(result);
		scan.close();
	}

}
