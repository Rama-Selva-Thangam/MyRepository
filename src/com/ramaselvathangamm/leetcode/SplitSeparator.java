package com.ramaselvathangamm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitSeparator {
	public static List<String> splitWordsBySeparator(List<String> words, char separator) {
		List<String> result = new ArrayList<>();
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			boolean inWord = false;

			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);

				if (c != separator) {
					sb.append(c);
					inWord = true;
				} else if (inWord) {
					result.add(sb.toString());
					sb.setLength(0);
					inWord = false;
				}
			}
			if (inWord) {
				result.add(sb.toString());
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<String> li1 = new ArrayList<>(Arrays.asList("$hello$", "$four$five$", "$$six$"));
		char separator = '$';
		List<String> result = splitWordsBySeparator(li1, separator);
		System.out.println(result.toString());
	}
}
