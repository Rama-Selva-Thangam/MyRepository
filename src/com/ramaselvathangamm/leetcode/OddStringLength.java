package com.ramaselvathangamm.leetcode;

import java.util.Arrays;

public class OddStringLength {
	public static String oddString(String[] words) {
		String res = words[0];
		int[] baseDiff = valueArray(res);
		for (int i = 1; i < words.length; i++) {
			int[] diff = valueArray(words[i]);

			if (!Arrays.equals(baseDiff, diff)) {
				return words[i];
			}
		}

		return res;
	}

	public static int[] valueArray(String word) {
		int[] arr = new int[word.length() - 1];
		for (int i = 0; i < word.length() - 1; i++) {
			arr[i] = word.charAt(i + 1) - word.charAt(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] sector = { "aaa", "bob", "ccc", "ddd" };
		System.out.println(oddString(sector));
	}
}
