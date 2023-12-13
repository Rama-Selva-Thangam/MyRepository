package com.ramaselvathangamm.maheshsan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
	private static Map<String, Integer> countFrequencyString(String word) {
		Map<String, Integer> result = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		word = word.toLowerCase();
		for (int i = 0; i < word.length(); i++) {
			char currentChar = word.charAt(i);
			if (Character.isLetterOrDigit(currentChar)) {
				sb.append(currentChar);
			} else if (sb.length() > 0) {
				result.put(sb.toString(), result.getOrDefault(sb.toString(), 0) + 1);
				sb.setLength(0);
			}
		}

		if (sb.length() > 0) {
			result.put(sb.toString(), result.getOrDefault(sb.toString(), 0) + 1);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		Map<String, Integer> result = countFrequencyString(word);
		System.out.println(result);
	}
}
