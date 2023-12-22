package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumCountAfterSplitting {
	public static int maxScore(String s) {
		int onesCountRight = 0, zeroesCountLeft = 0, maxScore = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				onesCountRight++;
			}
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0') {
				zeroesCountLeft++;
			} else {
				onesCountRight--;
			}

			maxScore = Math.max(maxScore, zeroesCountLeft + onesCountRight);
		}
		return maxScore;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the  String : ");
		String digits = scan.nextLine();
		int result = maxScore(digits);
		System.out.println(result);
	}

}
