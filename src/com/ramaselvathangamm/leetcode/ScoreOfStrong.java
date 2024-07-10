package com.ramaselvathangamm.leetcode;

import java.util.Scanner;

public class ScoreOfStrong {
	public static int scoreOfString(String s) {
		int result = 0;
		for (int i = 1; i < s.length(); i++) {
			result += Math.abs((s.charAt(i - 1) - 'a') - (s.charAt(i) - 'a'));
		}
		return result;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.nextLine();
		int result = scoreOfString(s);
		System.out.println(result);
		scan.close();

	}

}
