package com.ramaselvathangamm.leetcode;

public class CountingWordsWithPrefix {
	public static int prefixCount(String[] words, String pref) {
		int count = 0;
		for (String word : words) {
			if (word.length() >= pref.length() && word.substring(0, pref.length()).equals(pref))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] words = { "pay", "attention", "practice", "attend" };
		String pref = "at";
		int res = prefixCount(words, pref);
		System.out.println(res);
	}
}