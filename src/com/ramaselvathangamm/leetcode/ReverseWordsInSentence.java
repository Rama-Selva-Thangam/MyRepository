package com.ramaselvathangamm.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInSentence {
	public static String reverseWords(String sentence) {
		if (sentence == null || sentence.isEmpty()) {
			return sentence;
		}

		int spaceIndex = findNextSpace(sentence, 0);

		if (spaceIndex == -1) {
			return sentence;
		} else {
			String reversedSubstring = reverseWords(sentence.substring(spaceIndex + 1));
			return sentence.substring(spaceIndex + 1) + " " + sentence.substring(0, spaceIndex);
		}
	}

	private static int findNextSpace(String sentence, int start) {
		for (int i = start; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				return i;
			}
		}
		return -1;
	}

	public static String reverseString(String word) {
		String[] arr = word.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i] + " ");
		}
		return sb.toString().trim();

	}

	public static String reverseString2(String word) {
		String[] arr = word.split("\\s+");
		List<String> wordList = Arrays.asList(arr);
		Collections.reverse(wordList);
		return String.join(" ", wordList);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String word = scan.nextLine();
		String result = reverseWords(word);
		System.out.println(result);
		scan.close();
	}

}
