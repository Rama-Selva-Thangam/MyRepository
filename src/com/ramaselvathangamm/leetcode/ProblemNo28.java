package com.ramaselvathangamm.leetcode;

public class ProblemNo28 {
	public static int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		if (haystack.length() < needle.length()) {
			return -1;
		}

		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			int j;
			for (j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == needle.length()) {
				return i;
			}
		}
		return -1;
	
	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		int result = strStr(haystack, needle);
		System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);
		haystack = "aaaaa";
		needle = "bba";
		result = strStr(haystack, needle);
		System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);
		haystack = "";
		needle = "";
		result = strStr(haystack, needle);
		System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);

	}

}
