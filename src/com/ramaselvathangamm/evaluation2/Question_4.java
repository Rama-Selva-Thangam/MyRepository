package com.ramaselvathangamm.evaluation2;

public class Question_4 {
	public boolean canFormPalindrome(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		String lexigography=sortLexigography(str1);
		return false;
	}

	private String sortLexigography(String str1) {
		 
		return null;
	}
	
	public static void main(String[] args) {
		Question_4 question = new Question_4();
		String str1 = "Thanks";
		String str2 = "tank";
		System.out.println(question.canFormPalindrome(str1, str2));
		str2 = "hai";
		System.out.println(question.canFormPalindrome(str1, str2));
	}
}
