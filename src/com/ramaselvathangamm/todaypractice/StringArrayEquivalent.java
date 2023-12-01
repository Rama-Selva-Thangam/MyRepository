package com.ramaselvathangamm.todaypractice;

public class StringArrayEquivalent {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < (word1.length | word2.length); i++) {
			if (i < word1.length)
				sb1.append(word1[i]);
			if (i < word2.length)
				sb2.append(word2[i]);
		}
		return sb1.toString().equals(sb2.toString());
	}

	public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
		if (word1.length == 0 || word2.length == 0)
			return false;
		return String.join("", word1).equals(String.join("", word2));
	}

	public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
		return concatenateStrings(word1, 0, word2, 0);
	}

	private static boolean concatenateStrings(String[] word1, int index1, String[] word2, int index2) {
		if (index1 == word1.length && index2 == word2.length) {
			return true;
		}

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		if (index1 < word1.length) {
			sb1.append(word1[index1]);
		}

		if (index2 < word2.length) {
			sb2.append(word2[index2]);
		}

		return sb1.toString().equals(sb2.toString()) && concatenateStrings(word1, index1 + 1, word2, index2 + 1);
	}

	public static void main(String[] args) {
		String[] word1 = { "abc", "d", "defg" };
		String[] word2 = { "abcddefg" };
		boolean result = arrayStringsAreEqual2(word1, word2);
		System.out.println(result);
	}

}
