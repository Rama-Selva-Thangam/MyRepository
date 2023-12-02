package com.ramaselvathangamm.evaluation2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_3 {
	private Map<String, Integer> countFrequencyString(String word) {
		Map<String, Integer> result = new HashMap<>();
		word = word.toLowerCase().trim();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ' ') {
				sb.append(word.charAt(i));
			} else {
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
		Question_3 question = new Question_3();
		System.out.print("Enter the word: ");
		String word = scan.nextLine();
		Map<String, Integer> result = question.countFrequencyString(word);
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
